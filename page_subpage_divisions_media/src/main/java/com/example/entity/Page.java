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

@Entity
public class Page {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pageid;
	private String name;
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL,mappedBy="parentPage")
	private List<Page> pages;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name ="parent_pageid")
	private Page parentPage;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="page")
	private List<Division> divisions;
	
	
	
	public void addPage(Page p){
		if(pages == null){
			pages = new ArrayList<>();
		}
		p.setParentPage(this);
		pages.add(p);
	}
	public void addDivisions(Division div){
		if(divisions == null){
			divisions = new ArrayList<>();
		}
		div.setPage(this);
		divisions.add(div);
	}
 	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPageid() {
		return pageid;
	}
	public void setPageid(Long pageid) {
		this.pageid = pageid;
	}
	public List<Page> getPages() {
		return pages;
	}
	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	public Page getParentPage() {
		return parentPage;
	}
	public void setParentPage(Page parentPage) {
		this.parentPage = parentPage;
	}
	public List<Division> getDivisions() {
		return divisions;
	}
	public void setDivisions(List<Division> divisions) {
		this.divisions = divisions;
	}
	
}
