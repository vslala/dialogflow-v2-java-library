package com.dialogflow.chatbot.service;

import org.springframework.stereotype.Service;

import com.dialogflow.chatbot.contracts.Intent;
import com.dialogflow.chatbot.exceptions.IntentNotFoundException;
import com.dialogflow.chatbot.factory.IntentFactory;
import com.dialogflow.response.vo.WebhookRequestVO;
import com.dialogflow.response.vo.WebhookResponseVO;

@Service
public class ChatbotService {

	public WebhookResponseVO executeIntentLogic(WebhookRequestVO webhookRequest) throws IntentNotFoundException {
		IntentFactory factory = new IntentFactory();
		Intent intent = factory.getIntent(webhookRequest.getQueryResult().getIntent().getDisplayName());
		return intent.execute(webhookRequest);
	}

}
