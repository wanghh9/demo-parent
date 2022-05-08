/**
 * www.gp51.com Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.example.demo.enums;

/**
 *  错误码枚举类
 *
 */
public enum ErrorCodeEnum {

    NOT_FOUND(10000, "系统异常");
    /**
     * 状态码
     **/
    private Integer code;
    /**
     * 状态描述
     **/
    private String  description;

    /**
     * 私有构造方法
     * @param code        编码
     * @param description 描述
     **/
    private ErrorCodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 根据编码查找枚举
     * @param code 编码
     * @return 实例
     **/
    public static ErrorCodeEnum find(Integer code) {
        for (ErrorCodeEnum e : ErrorCodeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     **/
    public Integer getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>description</tt>.
     *
     * @return property value of description
     **/
    public String getDescription() {
        return description;
    }

}
