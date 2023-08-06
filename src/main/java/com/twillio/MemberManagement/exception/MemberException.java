package com.twillio.MemberManagement.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

public class MemberException extends RuntimeException {

    public final HttpStatus STATUS;
    String msg = "ERROR OCCURRED";
    public MemberException(HttpStatus status, String msg) {
        super(msg);
        this.STATUS = status;
    }
}
