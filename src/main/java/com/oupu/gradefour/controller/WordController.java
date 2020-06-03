package com.oupu.gradefour.controller;

import com.oupu.gradefour.entity.Word;
import com.oupu.gradefour.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.*;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;

    @RequestMapping("/getWord")
    public List<Word> getWord(int page, int pageSize) {
        return wordService.getWord(page, pageSize);
    }

    @RequestMapping("/addWord")
    public Integer addWord() {
        File file = new File("C:\\Users\\wushi\\Desktop\\大学英语四级必背单词词汇表.txt");
        Integer total = 0;
        if(file.isFile() && file.exists()) {
            try {
                InputStreamReader reader = new InputStreamReader(
                        new FileInputStream(file), "GBK"
                );
                BufferedReader bf = new BufferedReader(reader);
                String lineTxt = null;
                while((lineTxt = bf.readLine()) != null) {
                    if(lineTxt.trim().length() != 0) {
                        total += wordService.addWord(lineTxt);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println('c');
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println('c');
                e.printStackTrace();
            }
        }
        return total;
    }
}
