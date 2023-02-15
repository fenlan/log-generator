package com.fenlan.stream.starter.common.enums;

/**
 * @author fenlan
 */
public enum LogTypeEnum {

    // 从client抓取的HTTP日志
    HTTP_LOG("HTTP_LOG", "从client抓取的HTTP日志"),
    ;

    /**
     * 枚举Code
     */
    private String code;

    /**
     * 枚举说明
     */
    private String desc;

    LogTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code查找对于的枚举项
     *
     * @param code
     * @return
     */
    LogTypeEnum getEnumByCode(String code) {
        for (LogTypeEnum e : LogTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
