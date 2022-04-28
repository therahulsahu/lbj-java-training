package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rakuten.models.Post;
import com.rakuten.models.Tag;
import com.rakuten.repository.PostRepository;
import com.rakuten.repository.TagRepository;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner{
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	TagRepository tagRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Post post = new Post("many to many relationship", "Code example of many to many relationship in springboot", "Content goes here ...");
		
		Tag tag1 = new Tag("springboot");
		Tag tag2 = new Tag("java");
		
		post.getTags().add(tag1);
		post.getTags().add(tag2);
		
		tag1.getPosts().add(post);
		tag2.getPosts().add(post);
		
		postRepository.save(post);	
	}

}
