package com.javashitang.part2.po.sub;

import com.javashitang.part2.po.StudentBean;

import java.util.List;

public class FemaleStudentBean extends StudentBean{

    /*
     * 女学生信息，在学生信息的基础上多了女学生健康状况
     */
    private List<StudentHealthFemaleBean> studentHealthFemaleBeanList = null;

    public List<StudentHealthFemaleBean> getStudentHealthFemaleBeanList() {
        return studentHealthFemaleBeanList;
    }

    public void setStudentHealthFemaleBeanList(List<StudentHealthFemaleBean> studentHealthFemaleBeanList) {
        this.studentHealthFemaleBeanList = studentHealthFemaleBeanList;
    }
}
