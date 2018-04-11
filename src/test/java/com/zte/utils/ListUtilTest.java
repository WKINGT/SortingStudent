package com.zte.utils;

import com.zte.work.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 19:58
 * @Description:
 */
public class ListUtilTest {
    List<Student> list = new ArrayList<Student>();
    @Before
    public void setUp() throws Exception {

        list.add(new Student(7,"wang",30,600));
        list.add(new Student(2,"li",40,200));
        list.add(new Student(4,"zhao",20,300));
        list.add(new Student(3,"chen",50,400));
    }

    @Test
    public void deepCopy() throws Exception {
        List<Student> copyLIst = ListUtil.deepCopy(list);
        copyLIst.get(0).setAge(100);
        Assert.assertNotSame(copyLIst,list);
    }

}