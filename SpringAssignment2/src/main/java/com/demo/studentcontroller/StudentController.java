package com.demo.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.student.Student;
import com.demo.studentservice.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId) {
		Student student = studentService.getStudentById(studentId);
		if (student == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(student);
	}

	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long studentId,
			@RequestBody Student studentDetails) {
		Student student = studentService.updateStudent(studentId, studentDetails);
		if (student == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(student);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable(value = "id") Long studentId) {
		studentService.deleteStudent(studentId);
		return ResponseEntity.noContent().build();
	}
}
