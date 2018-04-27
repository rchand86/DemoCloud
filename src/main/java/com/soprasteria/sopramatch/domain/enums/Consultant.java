package com.soprasteria.sopramatch.domain.enums;

public interface Consultant {
	
	static enum GENDER_TYPE {
		MALE(0, "Male"), FEMALE(1, "Female"),
		OTHER(2, "Other"), UNKNOWN(3, "Unknown");

		private final Integer key;
		private final String value;

		private GENDER_TYPE(final Integer key, final String value) {
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
	 
	static enum ACHIEVEMENT_TYPE {
			BEGINNER(0, "Beginner"), SENIOR(1, "Senior"),
			CHAMPION(2, "Champion");

			private final Integer key;
			private final String value;

			private ACHIEVEMENT_TYPE(final Integer key, final String value) {
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
