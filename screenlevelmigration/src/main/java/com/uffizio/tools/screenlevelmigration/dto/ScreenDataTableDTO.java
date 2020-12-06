package com.uffizio.tools.screenlevelmigration.dto;

public class ScreenDataTableDTO {
	private int screenDataId;
	private int screenId;
	private int dataId;
	private int level;
	private String additionalColumns;
	private String tableNames;
	private String whereClause;
	private String groupByClause;
	private String havingClause;
	private String orderByClause;
	public int getScreenDataId() {
		return screenDataId;
	}
	public void setScreenDataId(int screenDataId) {
		this.screenDataId = screenDataId;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getAdditionalColumns() {
		return additionalColumns;
	}
	public void setAdditionalColumns(String additionalColumns) {
		this.additionalColumns = additionalColumns;
	}
	public String getTableNames() {
		return tableNames;
	}
	public void setTableNames(String tableNames) {
		this.tableNames = tableNames;
	}
	public String getWhereClause() {
		return whereClause;
	}
	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}
	public String getGroupByClause() {
		return groupByClause;
	}
	public void setGroupByClause(String groupByClause) {
		this.groupByClause = groupByClause;
	}
	public String getHavingClause() {
		return havingClause;
	}
	public void setHavingClause(String havingClause) {
		this.havingClause = havingClause;
	}
	public String getOrderByClause() {
		return orderByClause;
	}
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	
}
