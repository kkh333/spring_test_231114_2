package com.std.sdd;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/main/sbb")
    @ResponseBody
    public String sbb() {
        return "안녕하세요!!!!!!!!";
    }
}
