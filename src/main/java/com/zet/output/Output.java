package com.zet.output;

import com.zet.work.Student;

import java.util.List;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 15:11
 * @Description:
 */
public interface Output {
    void process(List<Student> students);
}