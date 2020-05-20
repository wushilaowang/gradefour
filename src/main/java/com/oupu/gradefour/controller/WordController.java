package com.oupu.gradefour.controller;

import com.oupu.gradefour.entity.Word;
import com.oupu.gradefour.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;

    @RequestMapping("/getWord")
    public List<Word> getWord() {
        return wordService.getWord();
    }
}
