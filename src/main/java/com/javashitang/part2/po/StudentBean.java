package com.javashitang.part2.po;

import java.io.Serializable;
import java.util.List;

public class StudentBean implements Serializable{

    /*
     * 学生对象,包括学生卡信息和学生成绩信息,有2个子类对象，男学生和女学生
     */
    private Integer id;
    private String studentName;
    private SexEnum sex;
    private Integer studentId;
    private String note;
    private StudentSelfcardBean studentSelfcard;
    private List<StudentLectureBean> studentLectureList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public StudentSelfcardBean getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfcardBean studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }

    public List<StudentLectureBean> getStudentLectureList() {
        return studentLectureList;
    }

    public void setStudentLectureList(List<StudentLectureBean> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
