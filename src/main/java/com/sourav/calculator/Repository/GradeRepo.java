package com.sourav.calculator.Repository;

import com.sourav.calculator.model.Grade;
import com.sourav.calculator.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepo extends CrudRepository<Grade, Long> {
    List<Grade> findByStudentId(Long studentId);
}
