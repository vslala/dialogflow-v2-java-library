package com.dialogflow.actions.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;

public class Image implements RichMessage {
	private String url;
	private String accessibilityText;
	private int height;
	private int width;
	
	public Image () {
		
	}
	
	public Image(String url, String accessibilityText, int height, int width) {
		this.url = url;
		this.accessibilityText = accessibilityText;
		this.height = height;
		this.width = width;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAccessibilityText() {
		return accessibilityText;
	}
	public void setAccessibilityText(String accessibilityText) {
		this.accessibilityText = accessibilityText;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String getName() {
		return null;
	}
	
	
}
