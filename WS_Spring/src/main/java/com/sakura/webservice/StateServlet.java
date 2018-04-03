package com.sakura.webservice;

import java.util.List;

import javax.jws.WebService;

import com.sakura.entity.State;

/**
 * 提供state的操作
 * 
 * @author sakula
 *
 */
@WebService
public interface StateServlet {
	/**
	 * 添加state
	 * 
	 * @param state 不能含有stateID,必含有stateName,stateKind
	 * @return 成功返回1，失败返回0,
	 */
	public int addState(State state);

	/**
	 * 删除state
	 * 
	 * @param state 必须含有stateID
	 * @return 成功返回1，失败返回0
	 */
	public int deleteState(State state);
	/**
	 * 修改state
	 * 
	 * @param state stateID不能改变
	 * @return 成功返回1，失败返回0
	 */
	public int updateState(State state);
	/**
	 * 根据stateName查找state
	 * 
	 * @param name
	 * @return 成功与否均返回state，未找到的stateID为-1
	 */
	public State findStateByName(String name);
	/**
	 * 查找全部state
	 * 
	 * @return 成功与否均返回list，未找到list[0].stateID为-1
	 */
	public List<State> findAllList();
	/**
	 * 按stateKind查找state
	 * 
	 * @param stateKind 
	 * @return 成功与否均返回list，未找到list[0].stateID为-1
	 */
	public List<State> findStateByKind(Integer stateKind);
}
