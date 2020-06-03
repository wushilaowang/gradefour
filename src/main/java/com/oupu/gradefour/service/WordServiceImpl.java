package com.oupu.gradefour.service;

import com.oupu.gradefour.dao.WordMapper;
import com.oupu.gradefour.entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordMapper wordMapper;
    @Override
    public List<Word> getWord(int page, int pageSize) {
        return wordMapper.getWord((page - 1) * pageSize, pageSize);
    }

    @Override
    public Integer addWord(String wordList) {
        System.out.println(wordList);
        String[] array = wordList.split("  ");
        List list = new ArrayList();
        for(String word : array) {
            if(word.trim() != "") {
                Word entity = new Word();
                String[] wordArray = word.split(" ");
                entity.setWord(wordArray[0]);
                String reg = "[\\u4e00-\\u9fa5]|[\\；\\，]";
                Matcher matcher = Pattern.compile(reg).matcher(wordArray[1]);
                StringBuilder s = new StringBuilder();
                while(matcher.find()) {
                    s.append(matcher.group(0));
                }

                String[] wordArray2 = wordArray[1].trim().split("[\\u4e00-\\u9fa5]|[\\. \\； \\，\\( \\) \\《 \\》]");
                StringBuilder right = new StringBuilder();
                for(int i=0; i<wordArray2.length; i++) {
                    right.append(wordArray2[i]);
                }
                System.out.println(wordArray2[0]);
//                System.out.println(wordArray[1].matches("[\\u4e00-\\u9fa5]"));
                entity.setParaphrase(s.toString());
                entity.setProperty(right.toString());
                list.add(entity);
            }
        }
        return wordMapper.addWord(list);
    }
}
