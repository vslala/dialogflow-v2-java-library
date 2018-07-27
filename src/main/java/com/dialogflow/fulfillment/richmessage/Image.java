package com.dialogflow.fulfillment.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Image implements RichMessage {
	@JsonProperty
	private String imageUri;
	@JsonProperty
	private String accessibilityText;
	
	public Image() {}
	
	public Image(String imageUri, String accessibilityText) {
		this.imageUri = imageUri;
		this.accessibilityText = accessibilityText;
	}
	
	public String getImageUri() {
		return imageUri;
	}
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	public String getAccessibilityText() {
		return accessibilityText;
	}
	public void setAccessibilityText(String accessibilityText) {
		this.accessibilityText = accessibilityText;
	}
	@Override
	public String getName() {
		return "image";
	}
	
}
