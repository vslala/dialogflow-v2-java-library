package com.dialogflow.response.vo;

import com.dialogflow.response.payload.FacebookPayload;
import com.dialogflow.response.payload.GooglePayload;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payload {
	
	@SerializedName("google")
	private GooglePayload googlePayload;
	
	@SerializedName("facebook")
	private FacebookPayload facebookPayload;

	public GooglePayload getGooglePayload() {
		return googlePayload;
	}

	public void setGooglePayload(GooglePayload googlePayload) {
		this.googlePayload = googlePayload;
	}

	public FacebookPayload getFacebookPayload() {
		return facebookPayload;
	}

	public void setFacebookPayload(FacebookPayload facebookPayload) {
		this.facebookPayload = facebookPayload;
	}
	

}
