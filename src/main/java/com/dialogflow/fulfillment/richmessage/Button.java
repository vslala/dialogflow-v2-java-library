package com.dialogflow.fulfillment.richmessage;

public class Button {
	private String title;
	private OpenUriAction openUriAction;
	
	public Button() {	}
	
	public Button(String title, OpenUriAction openUriAction) {
		this.title = title;
		this.openUriAction = openUriAction;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public OpenUriAction getOpenUriAction() {
		return openUriAction;
	}

	public void setOpenUriAction(OpenUriAction openUriAction) {
		this.openUriAction = openUriAction;
	}
}
