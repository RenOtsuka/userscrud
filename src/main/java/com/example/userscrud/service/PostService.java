package com.example.userscrud.service;

import org.springframework.stereotype.Service;

import com.example.userscrud.entity.Post;

@Service
public interface PostService {
	
	Post createPost(Post post);

}
