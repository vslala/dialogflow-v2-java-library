package com.dialogflow.response.vo;

import java.util.List;

public class FulfillmentResponse {
	private String fulfillmentText;
	private List<Object> fulfillmentMessages;
	private String source;
	private Object payload;
	private List<Object> outputContexts;
	private Object followupEventInput;
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public List<Object> getFulfillmentMessages() {
		return fulfillmentMessages;
	}
	public void setFulfillmentMessages(List<Object> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	public List<Object> getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(List<Object> outputContexts) {
		this.outputContexts = outputContexts;
	}
	public Object getFollowupEventInput() {
		return followupEventInput;
	}
	public void setFollowupEventInput(Object followupEventInput) {
		this.followupEventInput = followupEventInput;
	}
	
	
}
