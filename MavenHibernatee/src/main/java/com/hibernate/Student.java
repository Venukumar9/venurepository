package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
private int id ;
	@Column(name="sname")
private String sname;
	@Column(name="marks")
private int marks;
	@Column(name="stream")
private String stream;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
}
