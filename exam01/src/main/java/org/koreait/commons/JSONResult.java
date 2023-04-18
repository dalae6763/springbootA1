package org.koreait.commons;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class JSONResult<T> {
    private boolean success;
    private HttpStatus status;
    private String message; // 에러 발생시 메세지

    private T data; // 성공시 응답 데이터
}
