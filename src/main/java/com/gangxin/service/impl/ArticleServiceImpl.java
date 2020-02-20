package com.gangxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gangxin.dao.ArticleMapper;
import com.gangxin.entity.Article;
import com.gangxin.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	
	@Autowired
	private ArticleMapper articelMapper;
	

	@Override
	public PageInfo<Article> list(Article art,Integer page,Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Article> list = articelMapper.list(art);
		
		return new PageInfo<Article>(list);
	}


	@Override
	public PageInfo<Article> list2(Article art, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Article> list = articelMapper.list2(art);
		
		return new PageInfo<Article>(list);
	}


	@Override
	public PageInfo<Article> list3(Article art, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Article> list = articelMapper.list3(art);
		
		return new PageInfo<Article>(list);
	}

}
