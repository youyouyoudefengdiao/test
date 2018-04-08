package com.sakura.webservice.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.sakura.entity.State;
import com.sakura.entity.User;
import com.sakura.service.StateService;
import com.sakura.service.UserService;
import com.sakura.service.impl.StateServiceImpl;
import com.sakura.webservice.StateServlet;

/**
 * 为管理员提供的服务，state所有服务
 * 
 * @author sakura
 *
 */
@Component("stateServletForAD")//声明bean
@WebService
public class StateServletImpl implements StateServlet {
	@Resource
	private StateServiceImpl stateService;
	public int addState(State state) {
		int i=stateService.saveState(state);
			return i;
	}

	public int deleteState(State state) {
		
		try {
			stateService.deleteState(state);
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public int updateState(State state) {
		try {
			stateService.updateState(state);
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public State findStateByName(String name) {
		// TODO Auto-generated method stub
		return stateService.findStateByName(name);
	}

	public List<State> findAllList() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<State> findStateByKind(Integer stateKind) {
		// TODO Auto-generated method stub
		return null;
	}
}
