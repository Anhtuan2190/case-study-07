package com.example.demo.repository;

import com.example.demo.entity.QuestionContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IQuestionContentRepository extends JpaRepository<QuestionContent, UUID> {
}
