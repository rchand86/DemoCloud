package com.soprasteria.sopramatch.domain.enums;

public interface Department {

	static enum DEPARTMENT_TYPE {
		COMPANY(0, "Company"), BUSINESS_Devision(1, "Business Devision"), BUSINESS_UNIT(2, "Business Unit"), UNIT(3,
				"Unit"), PROJECT(4, "Project"), FUNCTIONS_SUPPORT(5, "Functions & Support");

		private final Integer key;
		private final String value;

		private DEPARTMENT_TYPE(final Integer key, final String value) {
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
