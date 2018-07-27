package com.dialogflow.fulfillment.richmessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dialogflow.chatbot.contracts.RichMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BasicCard implements RichMessage {
	@JsonProperty
	private String title;
	@JsonProperty
	private String subtitle;
	@JsonProperty
	private String formattedText;
	@JsonProperty
	private Image image;
	@JsonProperty
	private List<Button> buttons;
	
	public static class Builder {
		private String title;
		private String subtitle;
		private String formattedText;
		private Image image;
		private List<Button> buttons;
		
		public Builder() {
			buttons = new ArrayList<>();
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder subtitle(String subtitle) {
			this.subtitle = subtitle;
			return this;
		}
		
		public Builder formattedText(String formattedText) {
			this.formattedText = formattedText;
			return this;
		}
		
		public Builder image(Image image) {
			this.image = image;
			return this;
		}
		
		public Builder addButton(Button button) {
			buttons.add(button);
			return this;
		}
		
		public Builder addButtons(Button... buttons) {
			this.buttons.addAll(new ArrayList<Button>(Arrays.asList(buttons)));
			return this;
		}
		
		public BasicCard build() {
			return new BasicCard(this);
		}
	} 
 
	public BasicCard(Builder builder) {
		this.title = builder.title;
		this.subtitle = builder.subtitle;
		this.formattedText = builder.formattedText;
		this.image = builder.image;
		this.buttons = builder.buttons;
	}

	@Override
	public String getName() {
		return "basicCard";
	}

}

