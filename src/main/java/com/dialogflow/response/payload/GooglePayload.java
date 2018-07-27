package com.dialogflow.response.payload;

import com.dialogflow.chatbot.enums.Platform;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GooglePayload {
	@JsonProperty
	private boolean expectUserResponse;
	@JsonProperty
	private RichResponse richResponse;
	
	public GooglePayload(boolean expectUserResponse, RichResponse richResponse) {
		this.expectUserResponse = expectUserResponse;
		this.richResponse = richResponse;
	}
	
	public boolean isExpectUserResponse() {
		return expectUserResponse;
	}
	public void setExpectUserResponse(boolean expectUserResponse) {
		this.expectUserResponse = expectUserResponse;
	}
	public RichResponse getRichResponse() {
		return richResponse;
	}
	public void setRichResponse(RichResponse richResponse) {
		this.richResponse = richResponse;
	}
	
	@JsonIgnore
	public String getPlatformName() {
		return Platform.lowerCase(Platform.GOOGLE);
	}
	
}
