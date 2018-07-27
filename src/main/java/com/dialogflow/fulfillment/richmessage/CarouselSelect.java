package com.dialogflow.fulfillment.richmessage;

import java.util.ArrayList;
import java.util.List;

import com.dialogflow.chatbot.contracts.RichMessage;
import com.dialogflow.chatbot.util.ChatbotUtil;

public class CarouselSelect implements RichMessage {
	private List<Item> items;

	public CarouselSelect(Builder builder) {
		this.items = builder.items;
	}

	public CarouselSelect() {}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public static class Builder {
		private List<Item> items;
		
		public Builder addItem(Item item) {
			if (! ChatbotUtil.isSet(items)) {
				items = new ArrayList<>();
			}
			items.add(item);
			return this;
		}
		
		public CarouselSelect build() {
			return new CarouselSelect(this);
		}
		
	}

	@Override
	public String getName() {
		return "carouselSelect";
	}
}
