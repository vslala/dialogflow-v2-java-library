package com.dialogflow.chatbot.factory;

import com.dialogflow.fulfillment.richmessage.BasicCard;
import com.dialogflow.fulfillment.richmessage.Button;
import com.dialogflow.fulfillment.richmessage.Image;
import com.dialogflow.fulfillment.richmessage.OpenUriAction;
import com.dialogflow.fulfillment.richmessage.SimpleResponse;

public class CommonMessageFactory {

	/**
	 * @param string
	 * @param speech
	 * @param speech2
	 * @param image
	 * @param buttons
	 * @return
	 */
	public static BasicCard createBasicCard(String string, String speech, String speech2, Image image, Button... buttons) {
		return new BasicCard.Builder()
				.title(string)
				.subtitle(speech)
				.formattedText(speech2)
				.image(image)
				.addButtons(buttons)
				.build();
	}
	
	/**
	 * @param title
	 * @param uri
	 * @return
	 */
	public static Button createButton(String title, String uri) {
		return new Button(title, new OpenUriAction(uri));
	}
	
	/**
	 * @param imageUri
	 * @param accessibilityText
	 * @return
	 */
	public static Image createImage(String imageUri, String accessibilityText) {
		return new Image(
				imageUri, 
				accessibilityText);
	}
	
	public static SimpleResponse createSimpleResponseWithSSML(String ssml, String displayText) {
		return new SimpleResponse(null, ssml, displayText);
	}
	
	public static SimpleResponse createSimpleResponseWithTextToSpeech(String textToSpeech, String displayText) {
		return new SimpleResponse(textToSpeech, null, displayText);
	}
}
