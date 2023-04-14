package org.koreait.controllers.boards;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/write")
    public String write() {

        return "board/write";
    }

    @PostMapping("/write")
    public String writePs() {

        return "redirect:/board/list";
    }
}
