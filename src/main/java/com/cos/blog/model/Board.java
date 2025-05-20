package com.cos.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob // 대용량 데이터
    private String content; // 섬머노트 라이브러리

    @ColumnDefault("0")
    private int count;

    @ManyToOne(fetch = FetchType.EAGER) // Many = Board, User = One
    @JoinColumn(name = "userId")
    private User user;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY) // mappedBy 연관관계의 주인이 아니다 (난 FK가 아니에요) DB에 칼럼을 만들지 마세요
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp createDate;


}
