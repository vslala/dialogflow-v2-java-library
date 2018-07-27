package com.dialogflow.actions.richmessage;
import java.util.ArrayList;
import java.util.List;

import com.dialogflow.chatbot.contracts.RichMessage;

public class BasicCardGoogle implements RichMessage {

	private String title;
	private String subtitle;
	private String formattedText;
	private Image image;
	private List<Button> buttons;
	
	public BasicCardGoogle(Builder builder) {
		this.title = builder.title;
		this.subtitle = builder.subtitle;
		this.formattedText = builder.formattedText;
		this.image = builder.image;
		this.buttons = builder.buttons;
	}
	
	public static class Builder {
		private String title;
		private String subtitle;
		private String formattedText;
		private Image image;
		private List<Button> buttons = new ArrayList<Button>();;
		
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
			this.buttons.add(button);
			return this;
		}
		
		public Builder addButtons(List<Button> buttons) {
			this.buttons.addAll(buttons);
			return this;
		}
		
		public BasicCardGoogle build() {
			return new BasicCardGoogle(this);
		}
	}
	
	

	public String getTitle() {
		return title;
	}



	public String getSubtitle() {
		return subtitle;
	}



	public String getFormattedText() {
		return formattedText;
	}



	public Image getImage() {
		return image;
	}



	public List<Button> getButtons() {
		return buttons;
	}



	@Override
	public String getName() {
		return "basicCard";
	}

}
