package com.example.board1.service;

import com.example.board1.domain.Board1;
import com.example.board1.domain.Board1Repository;
import com.example.board1.domain.Board1RequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class Board1Service {

    private final Board1Repository board1Repository;

    @Transactional
    public Long update(Long id, Board1RequestDto requestDto) {
        Board1 board1 = board1Repository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        board1.update(requestDto);
        return board1.getId();
    }




}
