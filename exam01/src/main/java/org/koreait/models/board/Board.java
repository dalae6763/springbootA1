package org.koreait.models.board;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    @JsonIgnore
    private Long id; // 게시글 번호
    private String subject; // 제목
    private String content; // 내용

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime regDt; // 등록일시
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime modDt; // 수정일시
}
