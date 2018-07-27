package com.dialogflow.chatbot.factory;

import com.dialogflow.actions.richmessage.Image;
import com.dialogflow.actions.richmessage.LinkOutSuggestion;
import com.dialogflow.chatbot.contracts.RichMessage;
import com.dialogflow.chatbot.enums.RichMessageType;
import com.dialogflow.fulfillment.richmessage.Card;
import com.dialogflow.fulfillment.richmessage.CarouselSelect;
import com.dialogflow.fulfillment.richmessage.ListSelect;
import com.dialogflow.fulfillment.richmessage.QuickReplies;
import com.dialogflow.fulfillment.richmessage.SimpleResponses;
import com.dialogflow.fulfillment.richmessage.Suggestion;
import com.dialogflow.fulfillment.richmessage.Text;

public class RichMessageFactory {
	
	public static <T> T getRichMessage(RichMessageType messageType, Class<T> classType) {
		RichMessage richMessage = null;
		switch (messageType) {
		case TEXT:
			richMessage = new Text();
			break;
		case IMAGE:
			richMessage = new Image();
			break;
		case QUICK_REPLIES:
			richMessage = new QuickReplies();
			break;
		case CARD:
			richMessage = new Card();
			break;
		case SIMPLE_RESPONSES:
			richMessage = new SimpleResponses();
			break;
		case SUGGESTION:
			richMessage = new Suggestion();
			break;
		case LINK_OUT_SUGGESTION:
			richMessage = new LinkOutSuggestion();
			break;
		case LIST_SELECT:
			richMessage = new ListSelect();
			break;
		case CAROUSEL_SELECT:
			richMessage = new CarouselSelect();
			break;
		default:

			break;

		}
		T target = classType.cast(richMessage);
		return target;
	}

}
