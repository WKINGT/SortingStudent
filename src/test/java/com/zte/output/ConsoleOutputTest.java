package com.zte.output;

import com.zte.work.Student;
import com.zte.work.StudentSort;
import com.zte.work.StudentSortTest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 19:33
 * @Description:
 */
public class ConsoleOutputTest {
    private List<Student> sortedStudents = null;


    @Before
    public void setUp() throws Exception {
        List<Student> list = new ArrayList<>();
        list.add(new Student(7,"wang",70,700));
        list.add(new Student(2,"li",20,200));
        list.add(new Student(4,"zhao",40,400));
        list.add(new Student(3,"chen",30,300));
        sortedStudents = StudentSort.idSort(list,false);
    }

    @Test
    public void process() throws Exception {
        new ConsoleOutput().process(sortedStudents);
    }

}