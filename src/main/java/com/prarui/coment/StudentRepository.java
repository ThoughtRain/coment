package com.prarui.coment;

import com.prarui.coment.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentRepository extends JpaRepository<Student,Integer> {
}
