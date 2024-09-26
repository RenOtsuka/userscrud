package com.example.userscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.userscrud.entity.Post;
import com.example.userscrud.entity.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
}
