package com.example.board1.controller;

import com.example.board1.domain.Board1;
import com.example.board1.domain.Board1Repository;
import com.example.board1.domain.Board1RequestDto;
import com.example.board1.service.Board1Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequiredArgsConstructor
@RestController
public class Board1Controller {

    private final Board1Repository board1Repository;
    private final Board1Service board1Service;

    @PostMapping("/api/board1s")
    public Board1 createBoard1(@RequestBody Board1RequestDto requestDto) {
        Board1 board1 = new Board1(requestDto);
        return board1Repository.save(board1);
    }

    @GetMapping("/api/board1s")
    public List<Board1> getBoard1s() {
        return board1Repository.findAllByOrderByModifiedAtDesc();
    }

    @PutMapping("/api/board1s/{id}")
    public Long updateBoard1(@PathVariable Long id, @RequestBody Board1RequestDto requestDto){
        board1Service.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/board1s/{id}")
    public Long deleteBoard1(@PathVariable Long id) {
        board1Repository.deleteById(id);
        return id;
    }
}
