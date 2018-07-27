package com.dialogflow.fulfillment.richmessage;

public class Item {
	private SelectItemInfo info;
	private String title;
	private String description;
	private Image image;
	
	public Item() {}
	
	public Item(Builder builder) {
		this.info = builder.info;
		this.title = builder.title;
		this.description = builder.description;
		this.image = builder.image;
	}
	
	public static class Builder {
		private SelectItemInfo info;
		private String title;
		private String description;
		private Image image;
		
		public Builder info(SelectItemInfo info) {
			this.info = info;
			return this;
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder description(String description) {
			this.description = description;
			return this;
		}
		
		public Builder image(Image image) {
			this.image = image;
			return this;
		}
		
		public Item build() {
			return new Item(this);
		}
	}

	

	public SelectItemInfo getInfo() {
		return info;
	}

	public void setInfo(SelectItemInfo info) {
		this.info = info;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
