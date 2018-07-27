package com.dialogflow.chatbot.contracts;

import com.dialogflow.response.vo.WebhookRequestVO;
import com.dialogflow.response.vo.WebhookResponseVO;

public interface Intent {
	
	public WebhookResponseVO execute(WebhookRequestVO webhookRequest);
	
	default public WebhookResponseVO defaultResponse(WebhookRequestVO webhookRequest) {
		WebhookResponseVO webhookResponse = new WebhookResponseVO();
		webhookResponse.setFulfillmentText("Sorry, we do not recognize your action");
		return webhookResponse;
	}
}
