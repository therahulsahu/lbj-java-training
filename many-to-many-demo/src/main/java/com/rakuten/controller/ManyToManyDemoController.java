package com.rakuten.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.models.Post;
import com.rakuten.repository.PostRepository;
import com.rakuten.repository.TagRepository;

@RestController
@RequestMapping("/savePost")
public class ManyToManyDemoController {
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	TagRepository tagRepository;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void savePost(@RequestBody Post post) {
		System.out.println(post);
		
		postRepository.save(post);
	}

}
