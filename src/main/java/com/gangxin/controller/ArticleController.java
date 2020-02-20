package com.gangxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gangxin.entity.Article;
import com.gangxin.service.ArticleService;


@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	
	@RequestMapping("list")
	public String articles(Article art,Model model) {
		
		List<Article> list = articleService.list(art);
		for (Article article : list) {
			System.out.println(article.getD1());
		}
		model.addAttribute("list", list);
		
		return "list";
		
	}
	
	
}
