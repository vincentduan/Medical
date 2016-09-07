package com.gewu.Medical.serviceImpl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.UserRelArticleMapper;
import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.User;
import com.gewu.Medical.model.UserRelArticle;
import com.gewu.Medical.model.UserRelArticleExample;
import com.gewu.Medical.model.UserRelArticleExample.Criteria;
import com.gewu.Medical.service.UserRelArticleService;
import com.gewu.Medical.utils.Page;
@Service
public class UserRelArticleServiceImpl implements UserRelArticleService {
	
	@Autowired
	private UserRelArticleMapper userRelArticleMapper;
	
	@Override
	public UserRelArticleService findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(UserRelArticleService t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(UserRelArticleService t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void queryByPage(Page<UserRelArticleService> page,
			UserRelArticleService t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUserArticle(User user, Article article) {
		// TODO Auto-generated method stub
		Integer userid = user.getId();
		Integer articleid = article.getId();
		UserRelArticleExample userRelArticleExample = new UserRelArticleExample();
		Criteria criteria = userRelArticleExample.createCriteria();
		criteria.andArticleIdEqualTo(articleid);
		criteria.andUseridEqualTo(userid);
		List<UserRelArticle> userRelArticles = userRelArticleMapper.selectByExample(userRelArticleExample);
		if(userRelArticles.size()==0){
			UserRelArticle userRelArticle = new UserRelArticle();
			userRelArticle.setArticleId(articleid);
			userRelArticle.setUserid(userid);
			userRelArticle.setArticleTitle(article.getTitle());
			Timestamp ts = new Timestamp(System.currentTimeMillis());
			userRelArticle.setCreatetime(ts);
			userRelArticleMapper.insertSelective(userRelArticle);
		}
	}

	@Override
	public List<UserRelArticle> findUsersByArticleId(Integer id) {
		UserRelArticleExample userRelArticleExample = new UserRelArticleExample();
		Criteria criteria = userRelArticleExample.createCriteria();
		criteria.andArticleIdEqualTo(id);
		List<UserRelArticle> userRelArticles = userRelArticleMapper.selectByExample(userRelArticleExample);
		return userRelArticles;
	}

	@Override
	public List<UserRelArticle> findArticleByUserIds(List<Integer> userids) {
		UserRelArticleExample userRelArticleExample = new UserRelArticleExample();
		Criteria criteria = userRelArticleExample.createCriteria();
		criteria.andUseridIn(userids);
		List<UserRelArticle> userRelArticles = userRelArticleMapper.selectByExample(userRelArticleExample);
		return userRelArticles;
	}

}
