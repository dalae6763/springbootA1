package org.koreait.controllers.boards;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BoardForm {
    //@NotBlank(message="제목을 입력하세요")
    @NotBlank
    private String subject;
    
    //@NotBlank(message="내용을 입력하세요")
    @NotBlank
    private String content;
}
