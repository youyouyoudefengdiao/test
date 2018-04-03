package com.sakura.interceptor;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class UserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	public UserInterceptor() {
		super(Phase.PRE_INVOKE); // 在调用方法之前调用自定拦截器
	}

	@SuppressWarnings("null")
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers = message.getHeaders();
		if (headers == null && headers.size() == 0) {
			throw new Fault(new IllegalArgumentException("没有Header，拦截器实施拦截"));
		}

	}

}
