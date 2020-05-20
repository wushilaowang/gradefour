package com.oupu.gradefour.entity;

public class Word {
    private Integer id;
    private String word;
    private String paraphrase;

    public Word() {

    }

    public Integer getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getParaphrase() {
        return paraphrase;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setParaphrase(String paraphrase) {
        this.paraphrase = paraphrase;
    }
}
