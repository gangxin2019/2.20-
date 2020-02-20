package com.gangxin.entity;

public class Article {

	private Integer id;
	private String title;
	private String content;
	private String  channel;
	private String category;
	private String time;
	
	private String d1;
	private String d2;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(Integer id, String title, String content, String channel, String category, String time, String d1,
			String d2) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.channel = channel;
		this.category = category;
		this.time = time;
		this.d1 = d1;
		this.d2 = d2;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", channel=" + channel
				+ ", category=" + category + ", time=" + time + ", d1=" + d1 + ", d2=" + d2 + "]";
	}
	
	
	
	
	
	
	
}
