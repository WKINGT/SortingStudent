package com.zet.output;

import com.zet.work.Student;

import java.util.List;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 17:12
 * @Description:
 */
public class ConsoleOutput implements Output {
    @Override
    public void process(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

