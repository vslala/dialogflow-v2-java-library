package com.dialogflow.chatbot.contracts;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface RichMessage {
	@JsonIgnore
	public String getName();
	
}
