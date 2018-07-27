package com.dialogflow.fulfillment.richmessage;

import java.util.List;

import com.dialogflow.chatbot.contracts.RichMessage;

public class ListSelect implements RichMessage {
	private String title;
	private List<Item> items;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String getName() {
		return "listSelect";
	}
}

