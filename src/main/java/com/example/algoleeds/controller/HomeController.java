package com.example.algoleeds.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        log.info("home controller");
        return "index";
    }

    @GetMapping("/algoleeds/dfs")
    public String dfs(Model model) {
        log.info("dfs controller");
        return "dfs";
    }

    @GetMapping("/algoleeds/backTracking")
    public String backTracking(Model model) {
        log.info("backTracking controller");
        return "backTracking";
    }

    @GetMapping("/algoleeds/dynamicProgramming")
    public String dynamicProgramming(Model model) {
        log.info("dynamicProgramming controller");
        return "dynamicProgramming";
    }
}
