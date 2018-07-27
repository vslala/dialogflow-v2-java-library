package com.dialogflow.response.vo;

import java.util.ArrayList;
import java.util.List;

import com.dialogflow.chatbot.enums.Platform;
import com.dialogflow.chatbot.util.ChatbotUtil;
import com.dialogflow.fulfillment.richmessage.BasicCard;
import com.dialogflow.fulfillment.richmessage.Card;
import com.dialogflow.fulfillment.richmessage.CarouselSelect;
import com.dialogflow.fulfillment.richmessage.Image;
import com.dialogflow.fulfillment.richmessage.LinkOutSuggestion;
import com.dialogflow.fulfillment.richmessage.ListSelect;
import com.dialogflow.fulfillment.richmessage.QuickReplies;
import com.dialogflow.fulfillment.richmessage.SimpleResponses;
import com.dialogflow.fulfillment.richmessage.Suggestion;
import com.dialogflow.fulfillment.richmessage.Text;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FulfillmentMessage {
	
	public FulfillmentMessage(Builder builder) {
		this.platform = builder.platform;
		this.simpleResponses = builder.simpleResponses;
		this.card = builder.card;
		this.basicCard = builder.basicCard;
		this.carouselSelect = builder.carouselSelect;
		this.linkOutSuggestion = builder.linkOutSuggestion;
		this.listSelect = builder.listSelect;
		this.quickReplies = builder.quickReplies;
		this.suggestions = builder.suggestions;
		this.text = builder.text;
		this.image = builder.image;
	}

	private Platform platform;
	private Text text;
	private Image image;
	private QuickReplies quickReplies;
	private Card card;
	private SimpleResponses simpleResponses;
	private BasicCard basicCard;
	private List<Suggestion> suggestions;
	private LinkOutSuggestion linkOutSuggestion;
	private ListSelect listSelect;
	private CarouselSelect carouselSelect;
	
	
	
	public Platform getPlatform() {
		return platform;
	}



	public void setPlatform(Platform platform) {
		this.platform = platform;
	}



	public Text getText() {
		return text;
	}



	public void setText(Text text) {
		this.text = text;
	}



	public Image getImage() {
		return image;
	}



	public void setImage(Image image) {
		this.image = image;
	}



	public QuickReplies getQuickReplies() {
		return quickReplies;
	}



	public void setQuickReplies(QuickReplies quickReplies) {
		this.quickReplies = quickReplies;
	}



	public Card getCard() {
		return card;
	}



	public void setCard(Card card) {
		this.card = card;
	}



	public SimpleResponses getSimpleResponses() {
		return simpleResponses;
	}



	public void setSimpleResponses(SimpleResponses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}



	public BasicCard getBasicCard() {
		return basicCard;
	}



	public void setBasicCard(BasicCard basicCard) {
		this.basicCard = basicCard;
	}



	public List<Suggestion> getSuggestions() {
		return suggestions;
	}



	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	}



	public LinkOutSuggestion getLinkOutSuggestion() {
		return linkOutSuggestion;
	}



	public void setLinkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
		this.linkOutSuggestion = linkOutSuggestion;
	}



	public ListSelect getListSelect() {
		return listSelect;
	}



	public void setListSelect(ListSelect listSelect) {
		this.listSelect = listSelect;
	}



	public CarouselSelect getCarouselSelect() {
		return carouselSelect;
	}



	public void setCarouselSelect(CarouselSelect carouselSelect) {
		this.carouselSelect = carouselSelect;
	}



	public static class Builder {
		private Platform platform;
		private Text text;
		private Image image;
		private QuickReplies quickReplies;
		private Card card;
		private SimpleResponses simpleResponses;
		private BasicCard basicCard;
		private List<Suggestion> suggestions;
		private LinkOutSuggestion linkOutSuggestion;
		private ListSelect listSelect;
		private CarouselSelect carouselSelect;
		
		public Builder platform(Platform platform) {
			this.platform = platform;
			return this;
		}
		
		public Builder text(Text text) {
			this.text = text;
			return this;
		}
		
		public Builder quickReplies(QuickReplies quickReplies) {
			this.quickReplies = quickReplies;
			return this;
		}
		
		public Builder card (Card card) {
			this.card = card;
			return this;
		}
		
		public Builder basicCard(BasicCard basicCard) {
			this.basicCard = basicCard;
			return this;
		}
		
		public Builder addSuggestion(Suggestion suggestion) {
			if (! ChatbotUtil.isSet(this.suggestions)) {
				this.suggestions = new ArrayList<Suggestion>();
			}
			this.suggestions.add(suggestion);
			return this;
		}
		
		public Builder addLinkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
			this.linkOutSuggestion = linkOutSuggestion;
			return this;
		}
		
		public Builder linkSelect(ListSelect listSelect) {
			this.listSelect = listSelect;
			return this;
		}
		
		public Builder carouselSelect(CarouselSelect carouselSelect) {
			this.carouselSelect = carouselSelect;
			return this;
		}
		
		public FulfillmentMessage build() {
			return new FulfillmentMessage(this);
		}
		
	}
	
}
