package com.sakura.service;

import java.util.List;

import com.sakura.entity.State;
/**
 * 增删改均为管理员可操作，用户只能使用查询（非自主，以下拉列表形式或单选框形式）
 * @author sakula
 *
 */
public interface StateService {
	public int saveState(State state);
	public void updateState(State state);

	public State findStateByName(String name);
	public State findState(State state);
	public void deleteState(State state);

	public List<State> findAllList();
	
	public List<State> findStateByKind(Integer stateKind);
}
