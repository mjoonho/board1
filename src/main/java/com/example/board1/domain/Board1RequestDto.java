package com.example.board1.domain;

import lombok.Getter;
import org.apache.logging.log4j.util.Strings;

@Getter
public class Board1RequestDto {
    private String username;
    private String contents;
    private String title;
    private String myname;
    private String pw;

}
