package com.dialogflow.fulfillment.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;

public class QuickReplies implements RichMessage {
	private String title;
	private String[] quickReplies;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getQuickReplies() {
		return quickReplies;
	}
	public void setQuickReplies(String[] quickReplies) {
		this.quickReplies = quickReplies;
	}
	@Override
	public String getName() {
		return "quickReplies";
	}
}
