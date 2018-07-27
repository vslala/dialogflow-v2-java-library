package com.dialogflow.chatbot.factory;

import java.util.Arrays;

import com.dialogflow.actions.richmessage.BasicCardGoogle;
import com.dialogflow.actions.richmessage.Button;
import com.dialogflow.actions.richmessage.Image;
import com.dialogflow.actions.richmessage.LinkOutSuggestion;
import com.dialogflow.actions.richmessage.OpenUrlAction;


public class GoogleMessageFactory extends RichMessageFactory {
	
	public static BasicCardGoogle createBasicCard(String title, String subtitle, String formattedText, Image image, Button... buttons) {
		return new BasicCardGoogle.Builder()
				.title(title)
				.subtitle(subtitle)
				.formattedText(formattedText)
				.image(image)
				.addButtons(Arrays.asList(buttons))
				.build();
	}
	
	/**
	 * @param destinationName
	 * @param url
	 * @param openUrlAction
	 * @return
	 */
	public static LinkOutSuggestion createLinkOutSuggestion(
			String destinationName, String url, OpenUrlAction openUrlAction
			) {
		return new LinkOutSuggestion.Builder()
				.destinationName(destinationName)
				.url(url)
				.openUrlAction(openUrlAction)
				.build();
	}

	/**
	 * @param url
	 * @param accessibilityText
	 * @param height
	 * @param width
	 * @return
	 */
	public static Image createImage(String url, String accessibilityText, int height, int width) {
		return new Image(url, accessibilityText, height, width);
	}

	/**
	 * @param title
	 * @param url
	 * @return
	 */
	public static Button createButton(String title, String url) {
		return new Button.Builder()
				.title(title)
				.url(url)
				.build();
	}
}
