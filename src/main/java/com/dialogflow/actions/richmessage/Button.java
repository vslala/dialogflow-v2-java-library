package com.dialogflow.actions.richmessage;
import java.util.List;

import com.dialogflow.chatbot.enums.UrlTypeHint;

public class Button {
	private String title;
	private OpenUrlAction openUrlAction;
	
	public Button(Builder builder) {
		this.title = builder.title;
		this.openUrlAction = builder.openUrlAction;
	}
	
	public static class Builder {
		private String title;
		private OpenUrlAction openUrlAction;
		
		public Builder() {
			openUrlAction = new OpenUrlAction();
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder url(String url) {
			openUrlAction.setUrl(url);
			return this;
		}
		
		public Builder androidApp(String packageName, List<VersionFilter> versions) {
			AndroidApp androidApp = new AndroidApp();
			androidApp.setPackageName(packageName);
			androidApp.setVersions(versions);
			return this;
		}
		
		public Builder urlTypeHint(UrlTypeHint urlTypeHint) {
			openUrlAction.setUrlTypeHint(urlTypeHint);
			return this;
		}
		
		public Button build() {
			return new Button(this);
		}
	}
	
	public String getTitle() {
		return title;
	}
	public OpenUrlAction getOpenUrlAction() {
		return openUrlAction;
	}
	public void setOpenUrlAction(OpenUrlAction openUrlAction) {
		this.openUrlAction = openUrlAction;
	}
	
	
}
