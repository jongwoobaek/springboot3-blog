package com.jongwoo.springbootdeveloper.service;

import com.jongwoo.springbootdeveloper.domain.Article;
import com.jongwoo.springbootdeveloper.dto.AddArticleRequest;
import com.jongwoo.springbootdeveloper.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
