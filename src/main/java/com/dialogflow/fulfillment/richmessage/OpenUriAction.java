package com.dialogflow.fulfillment.richmessage;

public class OpenUriAction {
	private String uri;

	public OpenUriAction(String uri) {
		this.uri = uri;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
}