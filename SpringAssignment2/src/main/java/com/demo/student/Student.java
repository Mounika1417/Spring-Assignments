package com.demo.student;

public class Student {
  
    private Long id;
    private String name;
    private String stream;
    private int marks;
	public Student(Long id, String name, String stream, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.marks = marks;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stream=" + stream + ", marks=" + marks + "]";
	}
    
}