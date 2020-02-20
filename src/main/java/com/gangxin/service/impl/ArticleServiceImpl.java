package com.gangxin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gangxin.dao.ArticleMapper;
import com.gangxin.entity.Article;
import com.gangxin.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	
	@Autowired
	private ArticleMapper articelMapper;
	

	@Override
	public List<Article> list(Article art) {
		
		List<Article> list = articelMapper.list(art);
		
		return list;
	}

}
