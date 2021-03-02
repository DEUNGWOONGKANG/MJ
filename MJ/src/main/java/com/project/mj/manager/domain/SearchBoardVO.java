package com.project.mj.manager.domain;


public class SearchBoardVO {
	private String searchWriter;
	private String searchTitle;
	private String startdate;
	private String enddate;
	private Criteria cri;
	public String getSearchWriter() {
		return searchWriter;
	}
	public void setSearchWriter(String searchWriter) {
		this.searchWriter = searchWriter;
	}
	public String getSearchTitle() {
		return searchTitle;
	}
	public void setSearchTitle(String searchTitle) {
		this.searchTitle = searchTitle;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	
}
