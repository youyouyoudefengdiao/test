package com.lgd.study.shmtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 状态表
 * 
 * @author sakula
 *
 */
@Entity
@Table(name="State")
public class State {
	@Id//主键
	@GeneratedValue(strategy = GenerationType.AUTO)//自增长策略
	private Integer state_id;// 状态编号
	private String stateName;// 状态名

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
