package com.dialogflow.actions.richmessage;

import com.dialogflow.chatbot.enums.UrlTypeHint;

public class OpenUrlAction {
	private String url;
	private AndroidApp androidApp;
	private UrlTypeHint urlTypeHint;
	
	public OpenUrlAction() {}
	
	public OpenUrlAction(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public AndroidApp getAndroidApp() {
		return androidApp;
	}
	public void setAndroidApp(AndroidApp androidApp) {
		this.androidApp = androidApp;
	}
	public UrlTypeHint getUrlTypeHint() {
		return urlTypeHint;
	}
	public void setUrlTypeHint(UrlTypeHint urlTypeHint) {
		this.urlTypeHint = urlTypeHint;
	}
	
	
}
