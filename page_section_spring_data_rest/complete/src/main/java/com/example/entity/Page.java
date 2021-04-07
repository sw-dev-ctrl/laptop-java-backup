package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Page {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pageid;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="page")
	private List<Division> divisions;
	@OneToOne
	@JoinColumn(name="categoryid")
	private Category category; 
	public void addDivision(Division div){
		if(divisions==null){
			divisions= new ArrayList<>();
		}
		div.setPage(this);
		divisions.add(div);
	}
	private String name;
	public long getPageid() {
		return pageid;
	}
	public void setPageid(long pageid) {
		this.pageid = pageid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Division> getDivisions() {
		return divisions;
	}
	public void setDivisions(List<Division> divisions) {
		this.divisions = divisions;
	}
	
}
