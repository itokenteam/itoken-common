package com.zhu.itoken.common.dto.com.zhu.itoken.common;

public enum HttpStatus {
    BAD_STATUS(502,"获取上有服务失败11");
    private Integer code;
    private String message;

    private HttpStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
