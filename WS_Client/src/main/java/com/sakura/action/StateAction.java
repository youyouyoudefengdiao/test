package com.sakura.action;

import java.util.List;

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
	public String name;
	public String id;
	public String kind;
	private static String id_sta;
	public List<State> stateList;
	StateServletImplService service=new StateServletImplService();
	StateServlet servlet=service.getStateServletImplPort();
	
	


	



	public List<State> getStateList() {
		return stateList;
	}


	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

/**
 * 添加state，不能有id
 * @return
 */
	public String addState(){
		State state1=new State();
		state1.setStateName(name);
		state1.setStateKind(Integer.valueOf(kind));
		int i=servlet.addState(state1);
		if(i>0)
			return SUCCESS;
		else
			return ERROR;
	}
	/**
	 * 删除state
	 * @return
	 */
	public String deleteState(){
		State state1=new State();
		state1.setStateKind(Integer.valueOf(kind));
		state1.setStateName(name);
		state1.setStateID(Integer.valueOf(id));
		int i=servlet.deleteState(state1);
		if(i>0)
			return SUCCESS;
		else
			return ERROR;
	}
	/**
	 * 显示所有state
	 * @return
	 */
		public String showState(){
			stateList=servlet.findAllList();
			
			return SUCCESS;
			
		}
		
		
		/**
		 * 修改state
		 * @return
		 */
		public String updateState(){
			System.out.println(id_sta+" "+name+" "+kind);
			State state1=new State();
			state1.setStateID(Integer.valueOf(id_sta));
			state1.setStateKind(Integer.valueOf(kind));
			state1.setStateName(name);
			int i=servlet.updateState(state1);
			if(i>0)
			return SUCCESS;
			else
				return ERROR;
			
		}
		
		/**
		 * state数据重置,重新输入，保证页面有显示
		 * @return
		 */
		public String setStateValue(){
			String name1=name;
			id_sta=id;
			String kind1=kind;
			name=name1;
			id=id_sta;
			kind=kind1;
			return SUCCESS;
			
			
		}
}
