package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

//import java.time.LocalDate;
import java.util.List;



@Service
public class StudentService {
     private final StudentRepository studentRepository;
     @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public List<Student> getStudents(){
         return studentRepository.findAll();
//       return List.of(
//               new Student(
//                       1L,
//                       "josh",
//                       "nd@gmail.com",
//                       LocalDate.of(2000, 5, 9),
//                       21
//
//               )
//       );
    }


}
