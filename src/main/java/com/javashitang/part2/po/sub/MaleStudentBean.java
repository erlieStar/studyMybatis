package com.javashitang.part2.po.sub;

import com.javashitang.part2.po.StudentBean;

import java.util.List;

public class MaleStudentBean extends StudentBean{

    /*
     * 男学生信息，在学生信息的基础上多了男学生健康状况
     */
    private List<StudentHealthMaleBean> studentHealthMaleBeanList;

    public List<StudentHealthMaleBean> getStudentHealthMaleBeanList() {
        return studentHealthMaleBeanList;
    }

    public void setStudentHealthMaleBeanList(List<StudentHealthMaleBean> studentHealthMaleBeanList) {
        this.studentHealthMaleBeanList = studentHealthMaleBeanList;
    }
}
