package com.dialogflow.chatbot.enums;

public enum Platform {
	PLATFORM_UNSPECIFIED,
	FACEBOOK,
	SLACK,
	TELEGRAM,
	KIK,
	SKYPE,
	LINE,
	VIBER,
	ACTIONS_ON_GOOGLE,
	GOOGLE;
	
	public static String lowerCase(Platform platform) {
		return platform.name().toLowerCase();
	}
}
