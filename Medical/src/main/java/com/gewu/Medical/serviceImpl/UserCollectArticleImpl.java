package com.gewu.Medical.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gewu.Medical.dao.UserCollectionArticleMapper;
import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.User;
import com.gewu.Medical.model.UserCollectionArticle;
import com.gewu.Medical.model.UserCollectionArticleExample;
import com.gewu.Medical.model.UserCollectionArticleExample.Criteria;
import com.gewu.Medical.service.UserCollectService;
import com.gewu.Medical.utils.Page;

@Service
public class UserCollectArticleImpl implements UserCollectService {
	
	@Autowired
	private UserCollectionArticleMapper userCollectionArticleMapper;
	
	@Override
	public UserCollectionArticle findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(UserCollectionArticle t) {
		
		return userCollectionArticleMapper.insertSelective(t);
	}

	@Override
	public int update(UserCollectionArticle t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void queryByPage(Page<UserCollectionArticle> page,
			UserCollectionArticle t) {
		// TODO Auto-generated method stub

	}

	@Override
	public String isCollectArticle(User user, Article article) {
		if(user==null || article==null){
			return "0";
		}
		UserCollectionArticleExample userCollectionArticleExample = new UserCollectionArticleExample();
		Criteria criteria = userCollectionArticleExample.createCriteria();
		criteria.andUseridEqualTo(user.getId());
		criteria.andArticleIdEqualTo(article.getId());
		List<UserCollectionArticle> userCollectionArticles = userCollectionArticleMapper.selectByExample(userCollectionArticleExample);
		if(userCollectionArticles.size()>0){
			return "1";
		}
		return "0";
	}

}
