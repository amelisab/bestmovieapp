package com.tct.bestMovieApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "link")
public class Link {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private Long id;

	@Column(length = 500)
	private String url;

	private String provider;

	private int views;

	@Column(name = "report_broken")
	private int reportBroken;

	private int votes;

	@ManyToOne
	@JoinColumn(name = "quality", referencedColumnName = "id")
	private Quality quality;

	private int validity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "episode_id")
	private Episode episode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getReportBroken() {
		return reportBroken;
	}

	public void setReportBroken(int reportBroken) {
		this.reportBroken = reportBroken;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public Quality getQuality() {
		return quality;
	}

	public void setQuality(Quality quality) {
		this.quality = quality;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", url=" + url + ", provider=" + provider + ", views=" + views + ", reportBroken="
				+ reportBroken + ", votes=" + votes + ", quality=" + quality + ", validity=" + validity + "]";
	}

}
