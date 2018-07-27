package com.dialogflow.fulfillment.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;

public class Card implements RichMessage {
	private String title;
	private String subtitle;
	private String imageUri;
	private Button button;
	
	private class Button {
		private String text;
		private String postback;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getPostback() {
			return postback;
		}
		public void setPostback(String postback) {
			this.postback = postback;
		}
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}
	
	public Button createButton(String text, String postback) {
		Button button = new Button();
		button.setText(text);
		button.setPostback(postback);
		return button;
	}

	@Override
	public String getName() {
		return "card";
	}
	
	
}

