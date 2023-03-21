package com.bptn.feedapp.jpa;

import java.io.Serializable;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 * The persistent class for the "FeedMetaData" database table.
 * 
 */
@Entity
@Table(name="\"FeedMetaData\"")
public class FeedMetaData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"feedMetaDataId\"")
	private Integer feedMetaDataId;

	private String comment;

	@Column(name="\"createdOn\"")
	private Timestamp createdOn;

	@Column(name="\"isLike\"")
	private Boolean isLike;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="\"feedId\"")
	private Feed feed;

	@ManyToOne
	@JoinColumn(name="\"actionUserId\"")
	private User user;

	public FeedMetaData() {
	}

	public Integer getFeedMetaDataId() {
		return this.feedMetaDataId;
	}

	public void setFeedMetaDataId(Integer feedMetaDataId) {
		this.feedMetaDataId = feedMetaDataId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Boolean getIsLike() {
		return this.isLike;
	}

	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}

	public Feed getFeed() {
		return this.feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}