package com.dattci.rest_api.config;

import lombok.Getter;

@Getter
public class MasterPass {
    private String masterPassword;

    public MasterPass(String masterPassword) {
        this.masterPassword = masterPassword;
    }
}
