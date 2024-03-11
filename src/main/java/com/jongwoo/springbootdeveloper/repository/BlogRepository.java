package com.jongwoo.springbootdeveloper.repository;

import com.jongwoo.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
