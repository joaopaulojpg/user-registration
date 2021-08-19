package com.ibm.userregistration.domain.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ibm.userregistration.domain.entities.User;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
	Mono<User> saveOrUpdate(User user);
	Mono<User> findById(String id);
}
