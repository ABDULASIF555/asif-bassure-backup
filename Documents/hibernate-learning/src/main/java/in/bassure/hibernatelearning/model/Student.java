/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.bassure.hibernatelearning.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author bas200190
 */
@Entity
@Table(name="stuent ")
public class Student {
    
    @Id
    @Column(name="student_id")
    private int studentId;
    
    @Column(name="student_name")
    private String studentName;
    
    @Column(name="student_mark")
    private int studentMark;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }

    public Student(int studentId, String studentName, int studentMark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMark = studentMark;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentMark=" + studentMark + '}';
    }
    
    
}
