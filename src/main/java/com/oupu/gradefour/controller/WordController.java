package com.oupu.gradefour.controller;

import com.oupu.gradefour.entity.Word;
import com.oupu.gradefour.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;

    @RequestMapping("/getWord")
    public List<Word> getWord() {
        File file = new File("C:\\Users\\wushi\\Documents\\Tencent Files\\3072388337\\FileRecv\\MobileFile");
        System.out.println(file.exists() && file.exists());
        if(file.isFile() && file.exists()) {
            try {
                InputStreamReader reader = new InputStreamReader(
                        new FileInputStream(file)
                );
                BufferedReader bf = new BufferedReader(reader);
                String lineTxt = null;
                int a = 1;
                while((lineTxt = bf.readLine()) != null && a < 1) {
                    System.out.println(lineTxt);
                    a--;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return wordService.getWord();
    }
}
