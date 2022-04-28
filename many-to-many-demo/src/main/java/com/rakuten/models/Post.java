package com.rakuten.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title, description, content;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate = new Date();
	@Temporal(TemporalType.TIMESTAMP)
	private Date postedAtDate = new Date();
	
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	@JoinTable(name = "post_tags",
			joinColumns = { @JoinColumn(name = "post_id") },
			inverseJoinColumns = { @JoinColumn(name = "tag_id") })
	private Set<Tag> tags = new HashSet<>();

	public Post() {
	}
	
	public Post(String title, String description, String content) {
		this.title = title;
		this.description = description;
		this.content = content;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public Date getPostedAtDate() {
		return postedAtDate;
	}
	public void setPostedAtDate(Date postedAtDate) {
		this.postedAtDate = postedAtDate;
	}
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> set) {
		this.tags = set;
	}
}
