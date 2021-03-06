package com.cts.spring.model;

import com.cts.spring.entity.GroupEntity;

public class GroupModel {
	private String groupCode;
	private String groupTitle;
	private String description;
	private int port;
	public GroupModel() {
		
	}
	public GroupModel(GroupEntity entity,int port) {
	
		setGroupCode(entity.getGroupCode());
		setGroupTitle(entity.getGroupTitle());
		setDescription(entity.getDescription());
	
		setPort(port);
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getGroupTitle() {
		return groupTitle;
	}
	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	

}
