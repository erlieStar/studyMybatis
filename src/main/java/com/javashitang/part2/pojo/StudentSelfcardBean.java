package com.javashitang.part2.pojo;

import java.util.Date;

public class StudentSelfcardBean {

    /*
     * 学生卡信息
     */
    private Integer id;
    private Integer studentId;
    private String birthNative;
    private Date issueDate;
    private Date endDate;
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

    public String getBirthNative() {
        return birthNative;
    }

    public void setBirthNative(String birthNative) {
        this.birthNative = birthNative;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
