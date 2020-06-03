package com.oupu.gradefour.service;

import com.oupu.gradefour.entity.Word;

import java.util.List;

public interface WordService {
    List<Word> getWord(int page, int pageSize);
    Integer addWord(String wordList);
}
