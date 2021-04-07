package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryid;
	private String name;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL,mappedBy="parentCategory")
	private List<Category> categories;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name ="parent_categoryid")
	private Category parentCategory;
	@OneToOne(fetch=FetchType.LAZY,mappedBy="category")
	private Page page;
	
	
	
	public void addCategories(Category c){
		if(categories == null){
			categories = new ArrayList<>();
		}
		c.setParentCategory(this);
		categories.add(c);
	}
	public void addPage(Page p){
		p.setCategory(this);
		this.page=p;
	}
 	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("EKANSH");
		this.name = name;
	}
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public Category getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	
	
}
