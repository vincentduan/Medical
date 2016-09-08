package com.gewu.Medical.service;

import com.gewu.Medical.model.Article;
import com.gewu.Medical.model.User;
import com.gewu.Medical.model.UserCollectionArticle;

public interface UserCollectService extends BaseService<UserCollectionArticle> {
	public String isCollectArticle(User user, Article article);
}
