package com.sakura.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * 状态类
 * 菜品在售否，员工在岗否，病假否，餐桌各状态
 * 
 * @author sakula
 *
 */
@Entity
@Table(name="State")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stateID;// 状态编号
	private String stateName;// 状态名
	private Integer stateKind;//状态种类（菜品状态，员工状态）

	public Integer getStateKind() {
		return stateKind;
	}

	public void setStateKind(Integer stateKind) {
		this.stateKind = stateKind;
	}



	public Integer getStateID() {
		return stateID;
	}

	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
