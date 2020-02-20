package com.gangxin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gangxin.entity.Article;
import com.gangxin.service.ArticleService;
import com.gangxin.util.PageUtil;
import com.github.pagehelper.PageInfo;


@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	
	@RequestMapping("list")
	public String articles(HttpServletRequest request,Article art,Model model,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize) {
		
		PageInfo<Article> info = articleService.list(art,page,pageSize);
		PageUtil.page(request, "/list", pageSize, info.getList(), (int) info.getTotal(), page);
		model.addAttribute("info", info);
		
		return "list";
		
	}
	
	
	@RequestMapping("list2")
	public String articles2(HttpServletRequest request,Article art,Model model,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize) {
		
		PageInfo<Article> info = articleService.list2(art,page,pageSize);
		PageUtil.page(request, "/list", pageSize, info.getList(), (int) info.getTotal(), page);
		model.addAttribute("info", info);
		
		return "list";
		
	}
	
	@RequestMapping("list3")
	public String articles3(HttpServletRequest request,Article art,Model model,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize) {
		
		PageInfo<Article> info = articleService.list3(art,page,pageSize);
		PageUtil.page(request, "/list", pageSize, info.getList(), (int) info.getTotal(), page);
		model.addAttribute("info", info);
		
		return "list";
		
	}
	
	
}
