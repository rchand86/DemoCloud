package com.soprasteria.sopramatch.domain;

public class ServerlessResponse<T> {
	private T data;
	private Status status;
	
	public ServerlessResponse(final Code code, final T data) {
		this.data = data;
		this.status = new Status();
		this.status.setReturnCode(code.getCode());
		this.status.setDescription(code.getMsg());
	}
	
	public ServerlessResponse(final Code code) {
		this.status = new Status();
		this.status.setReturnCode(code.getCode());
		this.status.setDescription(code.getMsg());
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// Response Codes with Description
	
	public static enum Code {
		OK(1, "Success"), NO_DATA(0, "No Data Found"), INTERNAL_ERROR(-100, "Internal Error"), 
		AUTHENTICATION_ERROR(-101, "Invalid UserID Or Password"), SAVE_ERROR(-102, "Data Not Saved"), 
		FILTER_PARAM_ERROR(-103, "Filter Patrameter Not Found");

		private final long code;
		private final String msg;

		private Code(final long code, final String msg) {
			this.code = code;
			this.msg = msg;
		}

		public long getCode() {
			return this.code;
		}

		public String getMsg() {
			return this.msg;
		}
	}


}