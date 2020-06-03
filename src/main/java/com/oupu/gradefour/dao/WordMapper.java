package com.oupu.gradefour.dao;

import com.oupu.gradefour.entity.Word;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface WordMapper {
    List<Word> getWord(int page, int pageSize);
    Integer addWord(List list);
}
