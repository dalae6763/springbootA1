package org.koreait.restcontrollers.board;

import lombok.RequiredArgsConstructor;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
@RequiredArgsConstructor
public class ApiBoardController {
    private final BoardDao boardDao;

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
}
