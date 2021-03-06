package com.gewu.Medical.service;

import java.util.List;

import com.gewu.Medical.model.Article;

public interface ArticleService extends BaseService<Article> {
	public List<Article> findArticlesByCondition(Article article);

	public List<Article> findAllArticles();

	public List<Article> queryByCondiction(Article article);

	public List<Article> findArticlesByArticleIds(List<Integer> articleIds);
}
