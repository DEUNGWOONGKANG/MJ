package com.project.mj.manager.domain;


public class SearchDailyLogVO {
	private String manager;
	private String name;
	private String dbstartdate;
	private String dbenddate;
	private String depositstartdate;
	private String depositenddate;
	private int searchStatus;
	private Criteria cri;
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getDbstartdate() {
		return dbstartdate;
	}
	public void setDbstartdate(String dbstartdate) {
		this.dbstartdate = dbstartdate;
	}
	public String getDbenddate() {
		return dbenddate;
	}
	public void setDbenddate(String dbenddate) {
		this.dbenddate = dbenddate;
	}
	public String getDepositstartdate() {
		return depositstartdate;
	}
	public void setDepositstartdate(String depositstartdate) {
		this.depositstartdate = depositstartdate;
	}
	public String getDepositenddate() {
		return depositenddate;
	}
	public void setDepositenddate(String depositenddate) {
		this.depositenddate = depositenddate;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	public int getSearchStatus() {
		return searchStatus;
	}
	public void setSearchStatus(int searchStatus) {
		this.searchStatus = searchStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
