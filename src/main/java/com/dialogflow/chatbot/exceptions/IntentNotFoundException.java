package com.dialogflow.chatbot.exceptions;

public class IntentNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	private int errorCode;
	
	
	public IntentNotFoundException() {
		super();
	}
	
	public IntentNotFoundException(String errorMessage) {
		super(errorMessage);
		this.setErrorMessage(errorMessage);
	}
	
	public IntentNotFoundException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
