package com.spring5.movieservice.domain.repository;

import com.spring5.movieservice.domain.entity.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UserRepository extends ReactiveCrudRepository<UserEntity, Integer> {
    Mono<UserEntity> findByUserID(Integer uuid);
}
