package com.example.board1.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter

@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Board1 extends Timestamped { // 생성,수정 시간을 자동으로 만들어줍니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String myname;

    @Column(nullable = false)
    private String pw;

    public Board1(String username, String contents, String title, String myname , String pw) {
        this.username = username;
        this.contents = contents;
        this.title= title;
        this.myname= myname;
        this.pw = pw;
    }

    public Board1(Board1RequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.myname = requestDto.getMyname();
        this.pw = requestDto.getPw();
    }

    public void update(Board1RequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.myname = requestDto.getMyname();
        this.pw = requestDto.getPw();
    }
}