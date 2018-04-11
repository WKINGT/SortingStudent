package com.zte.work;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 19:22
 * @Description:
 */
public class StudentSortTest {
    List<Student> list = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        list.add(new Student(7,"wang",30,600));
        list.add(new Student(2,"li",40,200));
        list.add(new Student(4,"zhao",20,300));
        list.add(new Student(3,"chen",50,400));

    }

    @Test
    public void idSort() throws Exception {
        List<Student> sortList = StudentSort.idSort(list,false);
        List<Student> sortList1 = StudentSort.idSort(list,true);
        List<Student> exceptList = new ArrayList<>();
        exceptList.add(list.get(1));
        exceptList.add(list.get(3));
        exceptList.add(list.get(2));
        exceptList.add(list.get(0));
        Assert.assertArrayEquals(exceptList.toArray(),sortList.toArray());
        List<Student> exceptList1 = new ArrayList<>();
        exceptList1.add(list.get(0));
        exceptList1.add(list.get(2));
        exceptList1.add(list.get(3));
        exceptList1.add(list.get(1));
        Assert.assertArrayEquals(exceptList1.toArray(),sortList1.toArray());
    }

    @Test
    public void ageSort() throws Exception {
        List<Student> sortList = StudentSort.ageSort(list,false);
        List<Student> sortList1 = StudentSort.ageSort(list,true);

        List<Student> exceptList = new ArrayList<>();
        exceptList.add(list.get(2));
        exceptList.add(list.get(0));
        exceptList.add(list.get(1));
        exceptList.add(list.get(3));
        Assert.assertArrayEquals(exceptList.toArray(),sortList.toArray());
        List<Student> exceptList1 = new ArrayList<>();
        exceptList1.add(list.get(3));
        exceptList1.add(list.get(1));
        exceptList1.add(list.get(0));
        exceptList1.add(list.get(2));
        Assert.assertArrayEquals(exceptList1.toArray(),sortList1.toArray());
    }

    @Test
    public void scoreSort() throws Exception {
        List<Student> sortList = StudentSort.scoreSort(list,false);
        List<Student> sortList1 = StudentSort.scoreSort(list,true);
        List<Student> exceptList = new ArrayList<>();
        exceptList.add(list.get(1));
        exceptList.add(list.get(2));
        exceptList.add(list.get(3));
        exceptList.add(list.get(0));
        Assert.assertArrayEquals(exceptList.toArray(),sortList.toArray());
        List<Student> exceptList1 = new ArrayList<>();
        exceptList1.add(list.get(0));
        exceptList1.add(list.get(3));
        exceptList1.add(list.get(2));
        exceptList1.add(list.get(1));
        Assert.assertArrayEquals(exceptList1.toArray(),sortList1.toArray());

    }

}