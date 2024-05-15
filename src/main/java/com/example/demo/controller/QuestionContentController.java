package com.example.demo.controller;

import com.example.demo.service.IQuestionTypeService;
import com.example.demo.service.impl.QuestionContentService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping("/questionContent")
public class QuestionContentController {
    private final QuestionContentService questionContentService;

    private final IQuestionTypeService questionTypeService;

    public QuestionContentController(QuestionContentService questionContentService, IQuestionTypeService questionTypeService) {
        this.questionContentService = questionContentService;
        this.questionTypeService = questionTypeService;
    }


    @GetMapping
    public ModelAndView showList(@RequestParam(defaultValue = "") String name,
                                 @PageableDefault(size = 5, sort = {"id"},
                                 direction = Sort.Direction.DESC) Pageable pageable)
    {
        ModelAndView modelAndView = new ModelAndView("question");
        modelAndView.addObject("questionContent", questionContentService.findAll());
        modelAndView.addObject("questionType", questionTypeService.findAll());
        return modelAndView;
    }
}
