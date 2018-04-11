package com.zte.work;

import com.zte.utils.ListUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @Auther: TianW
 * @Date: 2018/4/11 16:55
 * @Description: 学生 id,age,score 的升降序排序
 */
public class StudentSort {
    /**
     * 按学生id排序
     * @param students
     * @param isDesc 是否降序排列，true 降序，false 升序
     * @return List<Student> 排序后的学生
     */
    public static List<Student> idSort(List<Student> students,boolean isDesc){
        List<Student> copyStudents = ListUtil.deepCopy(students);
        Collections.sort(copyStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(isDesc){
                    return o2.getId()-o1.getId();
                }
                return o1.getId()-o2.getId();
            }
        });
        return copyStudents;
    }

    /**
     * 按学生年龄排序
     * @param students
     * @param isDesc 是否降序排列，true 降序，false 升序
     * @return List<Student> 排序后的学生
     */
    public static List<Student> ageSort(List<Student> students,boolean isDesc){
        List<Student> copyStudents = ListUtil.deepCopy(students);
        Collections.sort(copyStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(isDesc){
                    return o2.getAge()-o1.getAge();
                }
                return o1.getAge()-o2.getAge();
            }
        });
        return copyStudents;
    }

    /**
     * 按学生成绩排序
     * @param students
     * @param isDesc 是否降序排列，true 降序，false 升序
     * @return List<Student> 排序后的学生
     */
    public static List<Student> scoreSort(List<Student> students,boolean isDesc){
        List<Student> copyStudents = ListUtil.deepCopy(students);
        Collections.sort(copyStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(isDesc){
                    return o2.getScore()-o1.getScore();
                }
                return o1.getScore()-o2.getScore();
            }
        });
        return copyStudents;
    }
}
