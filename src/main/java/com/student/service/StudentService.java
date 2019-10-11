package com.student.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.student.entity.Student;

@RepositoryRestResource
public interface StudentService extends CrudRepository<Student, Long> {

}
