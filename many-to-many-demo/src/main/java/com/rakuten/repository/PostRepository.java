package com.rakuten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
