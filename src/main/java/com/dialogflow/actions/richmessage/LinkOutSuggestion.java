package com.dialogflow.actions.richmessage;

import com.dialogflow.chatbot.contracts.RichMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LinkOutSuggestion implements RichMessage {
	public static class Builder {
		private String destinationName;
		private String url;
		private OpenUrlAction openUrlAction;
		
		public Builder destinationName(String destinationName) {
			this.destinationName = destinationName;
			return this;
		}
		
		public Builder url(String url) {
			this.url = url;
			return this;
		}
		
		public Builder openUrlAction(OpenUrlAction openUrlAction) {
			this.openUrlAction = openUrlAction;
			return this;
		}
		
		public LinkOutSuggestion build() {
			return new LinkOutSuggestion(this);
		}
		
	}

	@JsonProperty
	private String destinationName;
	@JsonProperty
	private String url;
	@JsonProperty
	private OpenUrlAction openUrlAction;

	public LinkOutSuggestion(Builder builder) {
		this.destinationName = builder.destinationName;
		this.url = builder.url;
		this.openUrlAction = builder.openUrlAction;
	}

	public LinkOutSuggestion() {
	}

	@Override
	public String getName() {
		return "linkOutSuggestion";
	}

}
