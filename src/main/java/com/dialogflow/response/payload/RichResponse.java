package com.dialogflow.response.payload;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dialogflow.actions.richmessage.LinkOutSuggestion;
import com.dialogflow.chatbot.contracts.RichMessage;
import com.dialogflow.chatbot.util.ChatbotUtil;
import com.dialogflow.fulfillment.richmessage.Suggestion;
import com.google.gson.annotations.SerializedName;

public class RichResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SerializedName("items")
	private List<Map<String, RichMessage>> items;
	@SerializedName("suggestions")
	private List<Suggestion> suggestions;
	@SerializedName("linkOutSuggestion")
	private LinkOutSuggestion linkOutSuggestion;
	
	public RichResponse(Builder builder) {
		this.items = builder.items;
		this.suggestions = builder.suggestions;
		this.linkOutSuggestion = builder.linkOutSuggestion;
	}
	
	
	public List<Map<String, RichMessage>> getItems() {
		return items;
	}


	public void setItems(List<Map<String, RichMessage>> items) {
		this.items = items;
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


	public static class Builder {
		private List<Map<String, RichMessage>> items;
		private List<Suggestion> suggestions;
		private LinkOutSuggestion linkOutSuggestion;
		
		public Builder addRichResponse(RichMessage item) {
			if (! ChatbotUtil.isSet(this.items)) {
				this.items = new ArrayList<>();
			}
			this.items.add(new HashMap<String, RichMessage>(){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{put(item.getName(), item);}
			});
			return this;
		}
		
		public Builder addSuggestionChip(String title) {
			if (! ChatbotUtil.isSet(this.suggestions)) {
				this.suggestions = new ArrayList<>();
			}
			this.suggestions.add(new Suggestion(title));
			return this;
		}
		
		public Builder addLinkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
			this.linkOutSuggestion = linkOutSuggestion;
			return this;
		}
		
		public RichResponse build() {
			return new RichResponse(this);
		}
	}
	
}
