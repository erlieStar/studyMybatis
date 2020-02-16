package com.javashitang.part2.po.sub;

import com.javashitang.part2.po.StudentHealthBean;

public class StudentHealthMaleBean extends StudentHealthBean{

    /*
     * 男学生健康状况，多了男生的检查项目
     */
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
