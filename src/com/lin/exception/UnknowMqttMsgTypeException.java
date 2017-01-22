package com.lin.exception;

public class UnknowMqttMsgTypeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 672130731583512631L;

	public UnknowMqttMsgTypeException(String errMsg) {
		super(errMsg);
	}
}
