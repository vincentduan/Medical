package com.gewu.Medical.service;

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.User;


public interface UserRelArticleService extends BaseService<UserRelArticleService> {
	public void saveUserArticle(User user,Article article);
}
