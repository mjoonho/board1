package com.example.board1.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Board1Repository extends JpaRepository<Board1, Long> {
    List<Board1> findAllByOrderByModifiedAtDesc();
}