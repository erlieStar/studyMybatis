package com.makenv.part2.po.sub;

import com.makenv.part2.po.StudentHealthBean;

public class StudentHealthFemaleBean extends StudentHealthBean{

    /*
     * 女学生健康状况，多了女生的检查项目
     */
    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
