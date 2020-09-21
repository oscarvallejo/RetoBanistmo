package com.banistmo.utilities;

public enum MsgError {

    MSG_VALUE_ERROR("Value no found, expect \"%s\", actual \"%s\"");

    private final String msg;

    MsgError(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
