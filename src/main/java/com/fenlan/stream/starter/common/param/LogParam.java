package com.fenlan.stream.starter.common.param;

import com.fenlan.stream.starter.common.enums.LogTypeEnum;

/**
 * @author fenlan
 */
public class LogParam {

    private LogTypeEnum logType;

    private String logContent;

    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(LogTypeEnum logType) {
        this.logType = logType;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    @Override
    public String toString() {
        return "LogParam{" +
                "logType=" + logType +
                ", logContent='" + logContent + '\'' +
                '}';
    }
}
