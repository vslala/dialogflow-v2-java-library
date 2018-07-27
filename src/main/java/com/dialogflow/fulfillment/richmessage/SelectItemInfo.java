package com.dialogflow.fulfillment.richmessage;

public class SelectItemInfo {
	private String key;
	private String[] synonyms;
	
	public SelectItemInfo() {}
	
	public SelectItemInfo(String key, String... synonyms) {
		this.key = key;
		this.synonyms = synonyms;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String[] getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(String[] synonyms) {
		this.synonyms = synonyms;
	}

}
