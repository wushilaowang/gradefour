package com.oupu.gradefour.service;

import com.oupu.gradefour.dao.WordMapper;
import com.oupu.gradefour.entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordMapper wordMapper;
    @Override
    public List<Word> getWord() {
        return wordMapper.getWord();
    }
}
