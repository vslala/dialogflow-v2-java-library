package com.dialogflow.response.vo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebhookResponseVO {
	private String fulfillmentText;
	private List<FulfillmentMessage> fulfillmentMessages;
	private String source;
	private Map<String, Object> payload;
	private List<Context> outputContexts;
	private List<EventInput> followupEventInput;
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public List<FulfillmentMessage> getFulfillmentMessages() {
		return fulfillmentMessages;
	}
	public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<Context> getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(List<Context> outputContexts) {
		this.outputContexts = outputContexts;
	}
	public List<EventInput> getFollowupEventInput() {
		return followupEventInput;
	}
	public void setFollowupEventInput(List<EventInput> followupEventInput) {
		this.followupEventInput = followupEventInput;
	}
	public Map<String, Object> getPayload() {
		return payload;
	}
	public void setPayload(Map<String, Object> payload) {
		this.payload = payload;
	}
	
	
	
}
