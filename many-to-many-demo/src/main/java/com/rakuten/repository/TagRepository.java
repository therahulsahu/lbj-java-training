package com.rakuten.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
