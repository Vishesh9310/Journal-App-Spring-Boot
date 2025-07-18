package com.vishesh.journalApp.repository;

import com.vishesh.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
   User findByUsername(String username); // ✅ fixed
}