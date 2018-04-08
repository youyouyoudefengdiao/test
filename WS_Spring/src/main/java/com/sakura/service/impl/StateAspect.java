package com.sakura.service.impl;
/**
 * state的拦截
 */

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.sakura.dao.BaseDao;
import com.sakura.entity.State;
import com.sakura.service.StateService;
public class StateAspect {
	
	@Resource
	private StateService stateService;
	private boolean exit=false;
	private boolean checked=false;
	/**
	 * 判断saveState的state是否存在，存在将exit置true
	 * @param jp
	 */
	public void doBefore(JoinPoint jp){
		String name=jp.getSignature().getName();//获取拦截方法名
		if(name.equals("saveState")&&(!checked)){
			checked=true;
			State state=(State)jp.getArgs()[0];
			System.out.println("名称"+state.getStateName());
			
			if(stateService.isExitStateName(state.getStateName())){
				exit=true;}}
	}
	
	/**
	 * 判断deleteState、updateState的id是否存在对应state，存在置exit为false
	 * 即错误条件置true
	 * @param jp
	 */
	public void doBeforeID(JoinPoint jp){
		String name=jp.getSignature().getName();//获取拦截方法名
		if(name.equals("deleteState")||name.equals("updateState")){
			State state=(State)jp.getArgs()[0];
			//ID为空
			if(state.getStateID().equals(null)){
				exit=true;
			}
			//ID不为空,判断对应id的state是否存在
			/*else{
				if(stateService.findStateByID(state.getStateID()).equals(null))
					exit=true;//存在置true
			}*/
		}
	}
	
	
	
	
	/**
	 * 判断state是否存在，存在返回0，阻塞访问
	 * @param pjp
	 * @return
	 * @throws Throwable 
	 */
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		if(!exit){
			
			System.out.println("不存在");
			checked=false;
			Object result=pjp.proceed();
			System.out.println(result+" "+pjp.getSignature().getName());
			if(!result.equals(null))
				return result;

			else
				return 0;
	}
		else{
			checked=false;
			return 0;}
	}
	
	
	public void doAfter(){
		
		
	}
	
}



