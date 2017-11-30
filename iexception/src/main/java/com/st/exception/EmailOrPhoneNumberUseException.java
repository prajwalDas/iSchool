package com.st.exception;

public class EmailOrPhoneNumberUseException extends BaseException{

	private static final long serialVersionUID = 1L;
	
	public EmailOrPhoneNumberUseException(String msg){
		super(msg);
	}

}
