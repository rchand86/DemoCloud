package com.soprasteria.sopramatch.domain.enums;

public interface Answer {
	
	static enum ANSWER_STATUS {
		OPEN(0, "Open"), SOLVED(1, "Solved"), 
		CLOSED(2, "Closed");

		private final Integer key;
		private final String value;

		private ANSWER_STATUS(final Integer key, final String value) {
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
