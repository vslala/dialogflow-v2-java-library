package com.dialogflow.response.vo;

import java.util.List;
import java.util.Map;

import com.dialogflow.chatbot.enums.Platform;
import com.dialogflow.chatbot.enums.Type;
import com.dialogflow.chatbot.enums.WebhookState;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.JsonElement;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebhookRequestVO {
	private String session;
	private String responseId;
	private QueryResult queryResult;
	private OriginalDetectIntentRequest originalDetectIntentRequest;
	
	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

	public class QueryResult {
		
		private String queryText;
		private String languageCode;
		private Double speechRecognitionConfidence;
		private String action;
		private Map<String, Object> parameters;
		private boolean allRequiredParamsPresent;
		private String fulfillmentText;
		private List<FulfillmentMessage> fulfillmentMessages;
		private String webhookSource;
		private Map<String, Object> webhookPayload;
		private List<Context> outputContexts;
		private Intent intent;
		private Double intentDetectionConfidence;
		private Object diagnosticInfo;
		
		public class Intent {
			private String name;
			private String displayName;
			private WebhookState webhookState;
			private int priority;
			private boolean isFallback;
			private boolean mlDisabled;
			private String[] inputContextNames;
			private String[] events;
			private List<TrainingPhrase> trainingPhrases;
			private String action;
			private List<Context> outputContexts;
			private boolean resetContexts;
			private List<Parameter> parameters;
			private List<FulfillmentMessage> messages;
			private List<Platform> defaultResponsePlatforms;
			private String rootFollowupIntentName;
			private String parentFollowupIntentName;
			private List<FollowupIntentInfo> followupIntentInfo;
			
			public class FollowupIntentInfo {
				private String followupIntentName;
				private String parentFollowupIntentName;
				public String getFollowupIntentName() {
					return followupIntentName;
				}
				public void setFollowupIntentName(String followupIntentName) {
					this.followupIntentName = followupIntentName;
				}
				public String getParentFollowupIntentName() {
					return parentFollowupIntentName;
				}
				public void setParentFollowupIntentName(String parentFollowupIntentName) {
					this.parentFollowupIntentName = parentFollowupIntentName;
				}
				
			}
			 
			public class Parameter {
				private String name;
				private String displayName;
				private String value;
				private String defaultValue;
				private String entityTypeDisplayName;
				private boolean mandatory;
				private String[] prompts;
				private boolean isList;
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public String getDisplayName() {
					return displayName;
				}
				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}
				public String getValue() {
					return value;
				}
				public void setValue(String value) {
					this.value = value;
				}
				public String getDefaultValue() {
					return defaultValue;
				}
				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}
				public String getEntityTypeDisplayName() {
					return entityTypeDisplayName;
				}
				public void setEntityTypeDisplayName(String entityTypeDisplayName) {
					this.entityTypeDisplayName = entityTypeDisplayName;
				}
				public boolean isMandatory() {
					return mandatory;
				}
				public void setMandatory(boolean mandatory) {
					this.mandatory = mandatory;
				}
				public String[] getPrompts() {
					return prompts;
				}
				public void setPrompts(String[] prompts) {
					this.prompts = prompts;
				}
				public boolean isList() {
					return isList;
				}
				public void setList(boolean isList) {
					this.isList = isList;
				}
				
				
			}
			
			public class TrainingPhrase {
				private String name;
				private Type type;
				private List<Part> parts;
				private int timesAddedCount;
				
				public class Part {
					private String text;
					private String entityType;
					private String alias;
					private boolean userDefined;
					public String getText() {
						return text;
					}
					public void setText(String text) {
						this.text = text;
					}
					public String getEntityType() {
						return entityType;
					}
					public void setEntityType(String entityType) {
						this.entityType = entityType;
					}
					public String getAlias() {
						return alias;
					}
					public void setAlias(String alias) {
						this.alias = alias;
					}
					public boolean isUserDefined() {
						return userDefined;
					}
					public void setUserDefined(boolean userDefined) {
						this.userDefined = userDefined;
					}
					
					
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Type getType() {
					return type;
				}

				public void setType(Type type) {
					this.type = type;
				}

				public List<Part> getParts() {
					return parts;
				}

				public void setParts(List<Part> parts) {
					this.parts = parts;
				}

				public int getTimesAddedCount() {
					return timesAddedCount;
				}

				public void setTimesAddedCount(int timesAddedCount) {
					this.timesAddedCount = timesAddedCount;
				}
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public WebhookState getWebhookState() {
				return webhookState;
			}

			public void setWebhookState(WebhookState webhookState) {
				this.webhookState = webhookState;
			}

			public int getPriority() {
				return priority;
			}

			public void setPriority(int priority) {
				this.priority = priority;
			}

			public boolean isFallback() {
				return isFallback;
			}

			public void setFallback(boolean isFallback) {
				this.isFallback = isFallback;
			}

			public boolean isMlDisabled() {
				return mlDisabled;
			}

			public void setMlDisabled(boolean mlDisabled) {
				this.mlDisabled = mlDisabled;
			}

			public String[] getInputContextNames() {
				return inputContextNames;
			}

			public void setInputContextNames(String[] inputContextNames) {
				this.inputContextNames = inputContextNames;
			}

			public String[] getEvents() {
				return events;
			}

			public void setEvents(String[] events) {
				this.events = events;
			}

			public List<TrainingPhrase> getTrainingPhrases() {
				return trainingPhrases;
			}

			public void setTrainingPhrases(List<TrainingPhrase> trainingPhrases) {
				this.trainingPhrases = trainingPhrases;
			}

			public String getAction() {
				return action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public List<Context> getOutputContexts() {
				return outputContexts;
			}

			public void setOutputContexts(List<Context> outputContexts) {
				this.outputContexts = outputContexts;
			}

			public boolean isResetContexts() {
				return resetContexts;
			}

			public void setResetContexts(boolean resetContexts) {
				this.resetContexts = resetContexts;
			}

			public List<Parameter> getParameters() {
				return parameters;
			}

			public void setParameters(List<Parameter> parameters) {
				this.parameters = parameters;
			}

			public List<FulfillmentMessage> getMessages() {
				return messages;
			}

			public void setMessages(List<FulfillmentMessage> messages) {
				this.messages = messages;
			}

			public List<Platform> getDefaultResponsePlatforms() {
				return defaultResponsePlatforms;
			}

			public void setDefaultResponsePlatforms(List<Platform> defaultResponsePlatforms) {
				this.defaultResponsePlatforms = defaultResponsePlatforms;
			}

			public String getRootFollowupIntentName() {
				return rootFollowupIntentName;
			}

			public void setRootFollowupIntentName(String rootFollowupIntentName) {
				this.rootFollowupIntentName = rootFollowupIntentName;
			}

			public String getParentFollowupIntentName() {
				return parentFollowupIntentName;
			}

			public void setParentFollowupIntentName(String parentFollowupIntentName) {
				this.parentFollowupIntentName = parentFollowupIntentName;
			}

			public List<FollowupIntentInfo> getFollowupIntentInfo() {
				return followupIntentInfo;
			}

			public void setFollowupIntentInfo(List<FollowupIntentInfo> followupIntentInfo) {
				this.followupIntentInfo = followupIntentInfo;
			}
			
			
		}
		
		public String getQueryText() {
			return queryText;
		}
		public void setQueryText(String queryText) {
			this.queryText = queryText;
		}
		public String getLanguageCode() {
			return languageCode;
		}
		public void setLanguageCode(String languageCode) {
			this.languageCode = languageCode;
		}
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		public Map<String, Object> getParameters() {
			return parameters;
		}
		public void setParameters(Map<String, Object> parameters) {
			this.parameters = parameters;
		}
		public boolean isAllRequiredParamsPresent() {
			return allRequiredParamsPresent;
		}
		public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
			this.allRequiredParamsPresent = allRequiredParamsPresent;
		}
		public String getFulfillmentText() {
			return fulfillmentText;
		}
		public void setFulfillmentText(String fulfillmentText) {
			this.fulfillmentText = fulfillmentText;
		}
		public List<FulfillmentMessage> getFulfillmentMessages() {
			return fulfillmentMessages;
		}
		public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
			this.fulfillmentMessages = fulfillmentMessages;
		}
		public String getWebhookSource() {
			return webhookSource;
		}
		public void setWebhookSource(String webhookSource) {
			this.webhookSource = webhookSource;
		}
		public Map<String, Object> getWebhookPayload() {
			return webhookPayload;
		}
		public void setWebhookPayload(Map<String, Object> webhookPayload) {
			this.webhookPayload = webhookPayload;
		}
		public List<Context> getOutputContexts() {
			return outputContexts;
		}
		public void setOutputContexts(List<Context> outputContexts) {
			this.outputContexts = outputContexts;
		}
		public Intent getIntent() {
			return intent;
		}
		public void setIntent(Intent intent) {
			this.intent = intent;
		}
		public Object getDiagnosticInfo() {
			return diagnosticInfo;
		}
		public void setDiagnosticInfo(Object diagnosticInfo) {
			this.diagnosticInfo = diagnosticInfo;
		}
		public Double getSpeechRecognitionConfidence() {
			return speechRecognitionConfidence;
		}
		public void setSpeechRecognitionConfidence(Double speechRecognitionConfidence) {
			this.speechRecognitionConfidence = speechRecognitionConfidence;
		}
		public Double getIntentDetectionConfidence() {
			return intentDetectionConfidence;
		}
		public void setIntentDetectionConfidence(Double intentDetectionConfidence) {
			this.intentDetectionConfidence = intentDetectionConfidence;
		}
		
	}
	
	public class OriginalDetectIntentRequest {
		private String source;
		private Map<String, JsonElement> payload;
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public Map<String, JsonElement> getPayload() {
			return payload;
		}
		public void setPayload(Map<String, JsonElement> payload) {
			this.payload = payload;
		}
		
	}
	
	
}
