package com.dialogflow.chatbot.enums;

public enum RichMessageType {
	TEXT,
	IMAGE,
	QUICK_REPLIES,
	CARD,
	SIMPLE_RESPONSE,
	SIMPLE_RESPONSES,
	BASIC_CARD,
	SUGGESTION,
	LINK_OUT_SUGGESTION,
	LIST_SELECT,
	CAROUSEL_SELECT;
	
	public static String getSimpleResponseText() {
		return "simpleResponse";
	}
	
	public static String getLinkOutSuggestionText() {
		return "linkOutSuggestion";
	}
	
}
