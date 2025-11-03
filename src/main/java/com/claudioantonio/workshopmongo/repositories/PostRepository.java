package com.claudioantonio.workshopmongo.repositories;

import com.claudioantonio.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
