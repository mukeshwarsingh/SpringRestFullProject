package org.mukesh.response;

import java.util.ArrayList;
import java.util.List;

public class JsonResponse {

	private int    code;
	private String message;
	private Object data;
	private Object metadata;
	private String messageId;
	
	private List<ResponseError> errors = new ArrayList<ResponseError>();
	
	public static JsonResponse instance(int code, String messageId, String message)
	{
		return new JsonResponse(code,messageId,message);
	}
	public static JsonResponse instance(int code, String messageId, String message, Object data)
	{
		return new JsonResponse(code,messageId,message, data);
	}
	public static JsonResponse instance(int code, String messageId,String message, Object data, Object metadata)
	{
		return new JsonResponse(code,messageId,message, data,metadata);
	}
	
	private JsonResponse(int code,String messageId, String message)
	{
		this.code = code;
		this.message = message;
		this.messageId = messageId;
	}
	private JsonResponse(int code,String messageId, String message, Object data)
	{
		this.code = code;
		this.message = message;
		this.data = data;
		this.messageId = messageId;
	}
	private JsonResponse(int code, String messageId,String message, Object data, Object metadata)
	{
		this.code = code;
		this.messageId = messageId;
		this.message = message;
		this.data = data;
		this.metadata = metadata;
	}
	public int getCode()
	{
		return code;
	}
	public String getMessage()
	{
		return message;
	}
	public Object getData()
	{
		return data;
	}
	public Object getMetaData()
	{
		return metadata;
	}
	public void addFieldError(String field,String message)
	{
		errors.add(new FieldError(field,message));
	}
	public List<ResponseError> getErrors()
	{
		return errors;
	}
	
	public abstract class ResponseError
	{
		public abstract String getType();
		public abstract Object getData();
	}
	
	public class FieldError extends ResponseError
	{
		private String type = "fielderror";
		private String field;
		private String message;

		
		public FieldError(String field, String message)
		{
			this.field = field;
			this.message = message;
		}
		public String getType()
		{
			return type;
		}
		public Object getData()
		{
			return data;
		}
		public String getField()
		{
			return this.field;
		}
		public String getMessage()
		{
			return this.message;
		}
	}

	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
