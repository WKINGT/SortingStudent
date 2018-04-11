package com.zte.output;

import com.zte.work.Student;

import java.util.List;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 17:12
 * @Description: 排序结果输出到控制台
 */
public class ConsoleOutput implements Output {
    @Override
    public void process(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

