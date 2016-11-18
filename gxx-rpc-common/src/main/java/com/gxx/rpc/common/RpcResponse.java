package com.gxx.rpc.common;

/**
 * @author 作者 E-mail:
 * @version 创建时间：Nov 14, 2016 11:54:07 AM 类说明
 */
public class RpcResponse {
	private String requestId;
	private Throwable error;
	private Object result;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Throwable getError() {
		return error;
	}

	public void setError(Throwable error) {
		this.error = error;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
