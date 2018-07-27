package com.dialogflow.response.vo;

import java.util.Map;

public class Context {
	private String name;
	private int lifespanCount;
	private Map<String, Object> parameters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifespanCount() {
		return lifespanCount;
	}

	public void setLifespanCount(int lifespanCount) {
		this.lifespanCount = lifespanCount;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, Object> parameters) {
		this.parameters = parameters;
	}

}
