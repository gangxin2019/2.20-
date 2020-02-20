package com.gangxin.service;

import java.util.List;

import com.gangxin.entity.Article;
import com.github.pagehelper.PageInfo;

public interface ArticleService {

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	PageInfo<Article> list(Article art,Integer page,Integer pageSize);

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	PageInfo<Article> list2(Article art, Integer page, Integer pageSize);

	/**
	 * 显示列表
	 * @param art
	 * @return
	 */
	PageInfo<Article> list3(Article art, Integer page, Integer pageSize);
	
}
