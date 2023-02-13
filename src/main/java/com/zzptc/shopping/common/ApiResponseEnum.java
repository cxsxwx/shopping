package com.zzptc.shopping.common;

public enum ApiResponseEnum {

	SUCCESS("0", "成功"),
	ERROR_PARAM("-2", "参数错误"),
	ERROR_DATA_EMPTY("-3", "无数据"),
	FAIL("-1", "失败"),
	SYSTEM_ERROR("000", "系统错误");

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private String msg;

	private ApiResponseEnum(String code, String name) {
		this.code = code;
		this.msg = name;
	}


}
