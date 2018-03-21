package com.lgd.study.shmtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 分组表
 * 
 * @author sakula
 *
 */
@Entity//bean实例
@Table(name="Groups")
public class Group {
	@Id//主键
	@GeneratedValue(strategy = GenerationType.AUTO)//自增长celve
	private Integer group_id;// 分组编号
	private String groupName;// 分组名

	public Integer getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
