package com.example.docker_test.repository;

import com.example.docker_test.entity.Contents;
import org.springframework.data.repository.CrudRepository;


public interface ContentsRepository  extends CrudRepository<Contents, Long> {
}
