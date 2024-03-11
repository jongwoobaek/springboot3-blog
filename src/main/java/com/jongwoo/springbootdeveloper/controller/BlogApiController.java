package com.jongwoo.springbootdeveloper.controller;

import com.jongwoo.springbootdeveloper.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BlogApiController {
    private final BlogService blogService;
}
