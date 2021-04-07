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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Division {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long divisionid;
	private String name;
	private String searchableTags;
	private String shortDescription;
	private String longDescription;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="division")
	private List<Media> media;
	private Float price;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="pageid")
	private Page page;
	
	
	
	public void addMedia(Media m){
		if(media==null){
			media= new ArrayList<>();
		}
		m.setDivision(this);
		media.add(m);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSearchableTags() {
		return searchableTags;
	}
	public void setSearchableTags(String searchableTags) {
		this.searchableTags = searchableTags;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public List<Media> getMedia() {
		return media;
	}
	public void setMedia(List<Media> media) {
		this.media = media;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}


	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Long getDivisionid() {
		return divisionid;
	}

	public void setDivisionid(Long divisionid) {
		this.divisionid = divisionid;
	}



	
}
