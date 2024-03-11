package com.jongwoo.springbootdeveloper.service;

import com.jongwoo.springbootdeveloper.domain.Article;
import com.jongwoo.springbootdeveloper.dto.AddArticleRequest;
import com.jongwoo.springbootdeveloper.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void deleteById(long id) {
        blogRepository.deleteById(id);
    }
}
