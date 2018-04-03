package com.sakura.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sakura.dao.BaseDao;
import com.sakura.entity.State;
import com.sakura.service.StateService;
@Service("stateService")
public class StateServiceImpl implements StateService{
	@Resource
	private BaseDao<State> baseDao;
	
	
	public int saveState(State state) {
		// TODO Auto-generated method stub
		baseDao.save(state);
		return 1;
	}

	public void updateState(State state) {
		// TODO Auto-generated method stub
		baseDao.update(state);
	}

	public State findStateByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.get("from State s where s.stateName=?",new Object[]{name});
	}

	public void deleteState(State state) {
		// TODO Auto-generated method stub
		baseDao.delete(state);
	}

	public List<State> findAllList() {
		// TODO Auto-generated method stub
		return baseDao.find("from State");
	}

	public List<State> findStateByKind(Integer stateKind) {
		// TODO Auto-generated method stub
		return baseDao.find("from State s where s.stateKind=?",new Object[]{stateKind});
	}

	public State findState(State state) {
		// TODO Auto-generated method stub
		
		return baseDao.get("from  State s where s.stateName=?",new Object[]{state.getStateName()});
	}

}
