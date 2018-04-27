package com.soprasteria.sopramatch.domain.enums;

public interface NewsItem {

	static enum NEWS_ITEM_TYPE {
		CEO_NEWS(0, "CEO News"), GENERAL_NEWS(1, "General News"), 
		WINNING_CARD(2, "Winning Card"), PROJECT_NEWS(3,"Project News"), 
		BUSINESS_UNIT_NEWS(4, "Business Unit News");

		private final Integer key;
		private final String value;

		private NEWS_ITEM_TYPE(final Integer key, final String value) {
			this.key = key;
			this.value = value;
		}

		public Integer getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

	}

	static enum NEWS_MEDIA_TYPE {
		NONE(0, "None"), IMAGE(1, "Image"), 
		VIDEO(2, "Video"), GIF(3, "GIF"), 
		SOUND(4, "Sound");

		private final Integer key;
		private final String value;

		private NEWS_MEDIA_TYPE(final Integer key, final String value) {
			this.key = key;
			this.value = value;
		}

		public Integer getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

	}

}
