package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
public class BoardData {
    @Id @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id; // 게시글 번호

    @Column(length=150, nullable = false)
    private String subject; // 게시글 제목

    @Lob
    @Column(nullable = false)
    private String content; // 게시글 내용

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private LocalDateTime regDt; // 게시글 작성일시

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private LocalDateTime modDt; // 게시글 수정일시

    @ManyToOne
    @JoinColumn(name="userNo")
    private Member member;
}
