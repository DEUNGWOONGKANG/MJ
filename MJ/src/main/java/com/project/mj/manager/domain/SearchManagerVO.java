package com.project.mj.manager.domain;


public class SearchManagerVO {
	private String searchKey;
	private int searchStatus;
	private String searchKeyword;
	private Criteria cri;
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public int getSearchStatus() {
		return searchStatus;
	}
	public void setSearchStatus(int searchStatus) {
		this.searchStatus = searchStatus;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
}
