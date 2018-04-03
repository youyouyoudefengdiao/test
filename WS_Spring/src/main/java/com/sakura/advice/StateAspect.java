package com.sakura.advice;


import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.sakura.entity.State;
import com.sakura.service.StateService;
public class StateAspect {
	
	@Resource
	private StateService stateService;
	private boolean exit;
	/**
	 * 判断saveState的state是否存在，存在将exit置true
	 * @param jp
	 */
	public void doBefore(JoinPoint jp){
		if(jp.getSignature().getName().equals("saveState"))
			if(!stateService.findState((State)jp.getArgs()[0]).equals(null))
				exit=true;
	}
	
	/**
	 * 判断state是否存在，存在返回0，阻塞访问
	 * @param pjp
	 * @return
	 * @throws Throwable 
	 */
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		if(!exit)
			
	return pjp.proceed();
		else
			return 0;
	}
}
