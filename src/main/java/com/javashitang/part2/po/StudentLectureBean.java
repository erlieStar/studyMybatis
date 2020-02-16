package com.javashitang.part2.po;

import java.math.BigDecimal;

public class StudentLectureBean {

    /*
     * 学生课程信息
     */
    private Integer id;
    private Integer studentId;
    private LectureBean lecture;
    private BigDecimal grade;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public LectureBean getLecture() {
        return lecture;
    }

    public void setLecture(LectureBean lecture) {
        this.lecture = lecture;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
