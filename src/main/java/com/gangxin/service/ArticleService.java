package com.gangxin.service;

import java.util.List;

import com.gangxin.entity.Article;

public interface ArticleService {

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	List<Article> list(Article art);
	
}
