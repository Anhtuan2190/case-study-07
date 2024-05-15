package com.example.demo.service.impl;

import com.example.demo.entity.QuestionContent;
import com.example.demo.repository.IQuestionContentRepository;
import com.example.demo.service.IQuestionContentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class QuestionContentService implements IQuestionContentService {
    private final IQuestionContentRepository questionContentRepository;

    @Override
    public QuestionContent findById(UUID id) {return null;}

    @Override
    public List<QuestionContent> findAll() {return questionContentRepository.findAll();}

    @Override
    public void save(QuestionContent questionContent) {questionContentRepository .save(questionContent);}

    @Override
    public void deleteById(UUID id) {questionContentRepository.deleteById(id);}

}
