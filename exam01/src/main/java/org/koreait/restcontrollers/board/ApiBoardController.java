package org.koreait.restcontrollers.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.controllers.boards.BoardForm;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDao;
import org.koreait.models.board.BoardWriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Log
@RestController
@RequestMapping("/api/boards")
@RequiredArgsConstructor
public class ApiBoardController {
    private final BoardDao boardDao;
    private final BoardWriteService service;


    @GetMapping
    public List<Board> boardList() {
        List<Board> list = boardDao.gets();

        return list;
    }

    @GetMapping("/{id}")
    public Board board(@PathVariable Long id) {
        Board board = boardDao.get(id);

        return board;
    }

    @PostMapping("/write")
    public ResponseEntity<List<Board>> write(@RequestBody BoardForm boardForm) {

        service.write(boardForm);

        //List<Board> boards = boardDao.gets();
        /**
        return ResponseEntity.status(HttpStatus.CREATED) // 201
                             .build();
         */
        return ResponseEntity.created(URI.create("/board/list")).build();
    }

    @ExceptionHandler(Exception.class)
    public String errorHandler() {

        return "예외발생!";
    }
}
