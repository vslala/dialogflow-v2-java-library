package com.dialogflow.chatbot.factory;

import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.dialogflow.chatbot.contracts.Intent;
import com.dialogflow.chatbot.exceptions.IntentNotFoundException;
import com.dialogflow.chatbot.util.ChatbotUtil;

public class IntentFactory {
	
	private static final String DOT = ".";
	private static final String INTENT_PACKAGE = "intent.package";
	private static final Logger logger = Logger.getLogger(IntentFactory.class);
	
	public Intent getIntent(String intentDisplayName) throws IntentNotFoundException {
		final String METHOD_NAME = "<IntentFactory.getIntent()>:";
		logger.debug("Intent Display Name: " + intentDisplayName);
		if (StringUtils.isEmpty(intentDisplayName)) {
			throw new IntentNotFoundException(METHOD_NAME + "Empty Intent Display Name. Intent Name: " + intentDisplayName);
		}
		
		String intentClassName = ChatbotUtil.getProperty(intentDisplayName);
		String className = ChatbotUtil.getProperty(INTENT_PACKAGE)
								.concat(DOT)
								.concat(ChatbotUtil.getProperty(intentDisplayName));
		Intent intent = null;
		if (! StringUtils.isEmpty(intentClassName)) {
			try {
				logger.info("Waking Intent: " + className);
				intent = (Intent) Class.forName(className).getDeclaredConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				logger.error(e.getMessage(), e);
				throw new IntentNotFoundException(METHOD_NAME + " Intent Name: " + className);
			}
		}
		return intent;
	}
}
