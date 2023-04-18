package org.koreait.commons;

import org.springframework.http.HttpStatus;

public class CommonException extends RuntimeException {

    private HttpStatus status;

    public CommonException(String message) {
        this(message, HttpStatus.INTERNAL_SERVER_ERROR); // 상태 코드가 없으면 500
    }

    public CommonException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
