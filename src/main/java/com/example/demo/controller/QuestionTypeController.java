package com.example.demo.controller;

import com.example.demo.service.impl.QuestionTypeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
@RequestMapping("/questionType")
public class QuestionTypeController {
    private QuestionTypeService questionTypeService;

    @GetMapping
    public ModelAndView findAll(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("questionType");
        modelAndView.addObject("questionType", questionTypeService.findAll());
        return modelAndView;
    }
}
