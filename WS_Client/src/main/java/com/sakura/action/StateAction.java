package com.sakura.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sakura.webservice.FindStateByName;
import com.sakura.webservice.State;
import com.sakura.webservice.StateServlet;
import com.sakura.webservice.impl.StateServletImplService;

public class StateAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public State state;
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String addState(){
		StateServletImplService service=new StateServletImplService();
		StateServlet servlet=service.getStateServletImplPort();
		State state1=new State();
		state1.setStateName("hhh");
		state1.setStateKind(1);
		int i=servlet.addState(state1);
		if(i>0)
			return SUCCESS;
		else
			return ERROR;
	}

}
