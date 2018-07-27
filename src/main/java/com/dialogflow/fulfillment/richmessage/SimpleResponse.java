package com.dialogflow.fulfillment.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleResponse implements RichMessage {
	@JsonProperty
	private String textToSpeech;
	@JsonProperty
	private String ssml;
	@JsonProperty
	private String displayText;
	
	public SimpleResponse(String textToSpeech, String ssml, String displaytext) {
		this.textToSpeech = textToSpeech;
		this.ssml = ssml;
		this.displayText = displaytext;
	}

	public String getTextToSpeech() {
		return textToSpeech;
	}

	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	public String getSsml() {
		return ssml;
	}

	public void setSsml(String ssml) {
		this.ssml = ssml;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	@Override
	public String getName() {
		return "simpleResponse";
	}

}