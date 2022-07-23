package com.jsik.book.springboot.domain.posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter                 //롬복 어노테이션. 클래스 내 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor      //롬복 어노테이션. 기본생성자 자동 추가
@Entity                 //JPA 어노테이션. 테이블과 링크될 클래스임을 나타냄

public class Posts {    //실제 DB의 테이블과 매칭될 클래스(Entitiy 클래스)

    @Id     //해당 테이블의 PK(primary key) 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성 규칙을 나타냄
    private Long id;

    @Column(length = 500, nullable = false)     //테이블의 column을 나타냄
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder    //해당 클래스의 빌더 패턴
    public Posts(String title,String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }


}
