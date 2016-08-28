package com.gewu.Medical.serviceImpl;

import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.ArticleMapper;
import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.ArticleExample;
import com.gewu.Medical.model.Doctor;
import com.gewu.Medical.model.DoctorExample;
import com.gewu.Medical.model.ArticleExample.Criteria;
import com.gewu.Medical.service.ArticleService;
import com.gewu.Medical.utils.Page;
@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public Article findById(Long id) {
		if (id == null)
			return null;
		return articleMapper.selectByPrimaryKey(Integer.parseInt(id+""));
	}

	@Override
	public int save(Article t) {
		return articleMapper.insertSelective(t);
	}

	@Override
	public int update(Article t) {
		return articleMapper.updateByPrimaryKeyWithBLOBs(t);
	}

	@Override
	public int deleteById(Long id) {
		return articleMapper.deleteByPrimaryKey(Integer.parseInt(id+""));
	}

	@Override
	public void queryByPage(Page<Article> page, Article t) {
		ArticleExample articleExample = new ArticleExample();
		Criteria criteria = articleExample.createCriteria();
		if(t!=null){
			if(t.getDoctorid()!=null){
				criteria.andDoctoridEqualTo(t.getDoctorid());
			}
		}
		criteria.andIsdelEqualTo(false);
		page2Exam(page, articleExample);
		int total = articleMapper.countByExample(articleExample);
		List<Article> list = articleMapper.selectByExample(articleExample);
		page.setTotalCount(total);
		page.setResult(list);
	}
	
	private void page2Exam(Page<Article> page, ArticleExample articleExample) {
		if (page != null && articleExample != null) {
			articleExample.setLimitEnd(page.getPageSize());
			articleExample.setLimitStart(page.getPageSize() * (page.getPageNo() - 1));
			if (page.getOrderBy() != null && page.getOrderBy().length() < 20) {
				articleExample.setOrderByClause(StringEscapeUtils.escapeSql(page.getOrderBy()));
			}
		}
	}
	
	@Override
	public List<Article> findArticlesByCondition(Article article) {
		if(article == null){
			return null;
		}
		ArticleExample articleExample = new ArticleExample();
		Criteria criteria = articleExample.createCriteria();
		if(article.getDoctorid() != null){
			criteria.andDoctoridEqualTo(article.getDoctorid());
		}
		if(StringUtils.isNotBlank(article.getCategory())){
			criteria.andCategoryEqualTo(article.getCategory());
		}
		List<Article> articles = articleMapper.selectByExample(articleExample);
		return articles;
	}

	@Override
	public List<Article> findAllArticles() {
		ArticleExample articleExample = new ArticleExample();
		List<Article> articles = articleMapper.selectByExample(articleExample);
		return articles;
	}

	@Override
	public Article queryByCondiction(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

}
