package com.example.exceptions;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Custom exception object
 *
 * @author rdrcelic
 * @since 24/02/17
 */
@Data
@NoArgsConstructor
public class CdcException extends Throwable {

    private String errorCode;
    private String message;
    private int status;

    public CdcException(String errorCode, String message, int status) {
        this.errorCode = errorCode;
        this.message = message;
        this.status = status;
    }
}
