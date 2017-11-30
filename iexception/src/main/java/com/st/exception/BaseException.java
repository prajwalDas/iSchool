package com.st.exception;

import com.st.exception.faultcode.IFaultCode;

public class BaseException extends Exception{

	private static final long serialVersionUID = 6473251338746550001L;
	private IFaultCode faultCode;

	public BaseException(IFaultCode faultCode){
		this.faultCode = faultCode;
	}	
	public BaseException(){
		super();
	}

	public BaseException(String msg){
		super(msg);
	}
	public IFaultCode getFaultCode() {
		return faultCode;
	}
	public void setFaultCode(IFaultCode faultCode) {
		this.faultCode = faultCode;
	}
}
