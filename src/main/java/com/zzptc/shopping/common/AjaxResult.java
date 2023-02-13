package com.zzptc.shopping.common;

import lombok.Getter;

@Getter
public class AjaxResult {
	private final String code;
	private Object data;
	private final String msg;

	private AjaxResult() {
		this.code = ApiResponseEnum.SUCCESS.getCode();
		this.msg = ApiResponseEnum.SUCCESS.getMsg();
	}

	private AjaxResult(Object data) {
		this();
		this.data = data;
	}

	private AjaxResult(ApiResponseEnum errorCode) {
		this.code = errorCode.getCode();
		this.msg = errorCode.getMsg();
	}

	public AjaxResult(String i, String msg) {
		this.code = i;
		this.msg = msg;
	}

	public static AjaxResult success() {
		return new AjaxResult();
	}

	public static AjaxResult success(Object data) {
		return new AjaxResult(data);
	}

	public static AjaxResult fail(ApiResponseEnum errorCode) {
		return new AjaxResult(errorCode);
	}

	public static AjaxResult error() {
		return new AjaxResult(ApiResponseEnum.SYSTEM_ERROR);
	}

}
