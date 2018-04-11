package com.zte.main;

import com.csvreader.CsvReader;
import com.zte.output.ConsoleOutput;
import com.zte.output.FileOutput;
import com.zte.work.Student;
import com.zte.work.StudentSort;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 17:30
 * @Description:
 */

public class Main {
    private static String FILE_PATH =  System.getProperty("user.dir") + File.separator + "studentFile" + File.separator + "学生信息.csv";

    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<Student>();
        System.out.println(FILE_PATH);
        try {
            CsvReader reader = new CsvReader(FILE_PATH, ',', Charset.forName("UTF-8"));
            reader.readHeaders();
            while (reader.readRecord()) {
                String[] values = reader.getValues();
                Student student = new Student(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]));
                studentsList.add(student);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Student> students = null;
        String savefilePath = "";
        Scanner sc = new Scanner(System.in);
        String sort = null;
        while(true){
            System.out.println("--------------------------------------");
            while (true){
                System.out.println("请选择排序方式：1,id排序；2，年龄排序；3，成绩排序；0，退出系统");
                sort = sc.nextLine();
                if(!"1".equals(sort)&&!"2".equals(sort)&&!"3".equals(sort)){
                    if("0".equals(sort)){
                        System.exit(0);
                    }else{
                        System.out.println("输入错误，请重新选择");
                        continue;
                    }
                }
                break;
            }
            boolean isDesc = false;
            while (true){
                System.out.println("是否降序排序：1，是； 2，  否；0，退出系统");
                String stringIsDesc = sc.nextLine();
                if(!"1".equals(stringIsDesc)&&!"2".equals(stringIsDesc)){
                    if("0".equals(sort)){
                        System.exit(0);
                    }else{
                        System.out.println("输入错误，请重新选择");
                        continue;
                    }
                }else{
                    if("1".equals(stringIsDesc)){
                        isDesc=true;
                    }
                }
                break;
            }
            switch (sort){
                case "1":
                    if(isDesc){
                        savefilePath = "学号降序排序.csv";
                    }else {
                        savefilePath = "学号升序排序.csv";
                    }
                    students = StudentSort.idSort(studentsList,isDesc);
                    break;
                case "2":
                    if(isDesc){
                        savefilePath = "年龄降序排序.csv";
                    }else {
                        savefilePath = "年龄升序排序.csv";
                    }
                    students = StudentSort.ageSort(studentsList,isDesc);
                    break;
                case "3":
                    if(isDesc){
                        savefilePath = "成绩降序排序.csv";
                    }else {
                        savefilePath = "成绩升序排序.csv";
                    }
                    students = StudentSort.scoreSort(studentsList,isDesc);
                    break;
                default:
            }
            while (true){
                System.out.println("请选择排序结果输出方式：1，控制台打印； 2，输出到文件；0，退出系统");
                String output = sc.nextLine();
                if(!"1".equals(output)&&!"2".equals(output)){
                    if("0".equals(sort)){
                        System.exit(0);
                    }else{
                        System.out.println("输入错误，请重新选择");
                        continue;
                    }
                }else{
                    if("1".equals(output)){
                        new ConsoleOutput().process(students);
                    }else {
                        FileOutput fileOutput = new FileOutput();
                        fileOutput.setFileName(savefilePath);
                        fileOutput.process(students);
                    }
                }
                break;
            }
        }
    }
}
