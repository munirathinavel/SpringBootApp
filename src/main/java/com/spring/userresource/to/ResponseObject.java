package com.spring.userresource.to;

public class ResponseObject {
	String responseMessage;
	String userId;
	Errors valErrors;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Errors getValErrors() {
		return valErrors;
	}

	public void setValErrors(Errors valErrors) {
		this.valErrors = valErrors;
	}

	class Errors {
		int code;
		String field;
		String message;

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

}
