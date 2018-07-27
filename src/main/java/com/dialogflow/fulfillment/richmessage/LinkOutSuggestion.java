package com.dialogflow.fulfillment.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;

public class LinkOutSuggestion implements RichMessage {
	private String destinationName;
	private String uri;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String getName() {
		return "linkOutSuggestion";
	}

}
