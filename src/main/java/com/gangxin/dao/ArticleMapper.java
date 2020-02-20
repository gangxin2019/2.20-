package com.gangxin.dao;

import java.util.List;

import com.gangxin.entity.Article;

public interface ArticleMapper {

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	List<Article> list(Article art);

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	List<Article> list2(Article art);

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	List<Article> list3(Article art);
	
	
}
