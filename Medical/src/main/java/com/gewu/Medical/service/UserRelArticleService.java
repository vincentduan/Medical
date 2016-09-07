package com.gewu.Medical.service;

import java.util.List;

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.User;
import com.gewu.Medical.model.UserRelArticle;


public interface UserRelArticleService extends BaseService<UserRelArticleService> {
	public void saveUserArticle(User user,Article article);

	public List<UserRelArticle> findUsersByArticleId(Integer id);

	public List<UserRelArticle> findArticleByUserIds(List<Integer> userids);
}
