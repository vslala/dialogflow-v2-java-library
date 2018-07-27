package com.dialogflow.fulfillment.richmessage;

import java.util.List;

import com.dialogflow.chatbot.contracts.RichMessage;

public class SimpleResponses implements RichMessage {
	private List<SimpleResponse> simpleResponses;

	public List<SimpleResponse> getSimpleResponses() {
		return simpleResponses;
	}

	public void setSimpleResponses(List<SimpleResponse> simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	@Override
	public String getName() {
		return "simpleResponses";
	}
}
