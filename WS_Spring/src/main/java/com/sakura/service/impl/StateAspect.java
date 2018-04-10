package com.sakura.service.impl;
/**
 * state的拦截，处理添加新state查找是否已存在同名state；删除和添加state，按id是否可找到存在的state
 */

import javax.annotation.Resource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import com.sakura.entity.State;
import com.sakura.service.StateService;

public class StateAspect {

	@Resource
	private StateService stateService;
	private boolean exit = false;
	private boolean checked = false;

	/**
	 * 判断saveState的state是否存在，存在将exit置true,判断删除和修改的state是否存在，存在置false
	 * 
	 * @param jp
	 */
	public void doBefore(JoinPoint jp) {
		String name = jp.getSignature().getName();// 获取拦截方法名
		if (name.equals("saveState") && (!checked)) {
			checked = true;
			State state = (State) jp.getArgs()[0];

			if (stateService.isExitStateName(state.getStateName())) {
				exit = true;
			}
		}

		else if (name.equals("deleteState") || name.equals("updateState")) {
			State state = (State) jp.getArgs()[0];
			if (!stateService.isExitStateID(state.getStateID())) {
				exit = true;// 不存在置true
			}
		}
	}

	/**
	 * 判断state是否符合状态，即添加应不存在，删除应存在，不符合状态返回0
	 * 
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		if (!exit) {
			checked = false;
			Object result = pjp.proceed();
			exit = false;
			return result;
		} else {
			checked = false;
			exit = false;
			return 0;
		}
	}

	public void doAfterThrowing(JoinPoint jp,Throwable ex){
		System.out.println("异常通知");
		System.out.println("异常信息："+ex.getMessage());
	}
}
