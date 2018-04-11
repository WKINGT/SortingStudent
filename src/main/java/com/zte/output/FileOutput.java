package com.zte.output;

import com.csvreader.CsvWriter;
import com.zte.work.Student;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/**
 * @Auther: TianW
 * @Date: 2018/4/11 17:14
 * @Description: 排序结果输出到文件
 */
public class FileOutput implements Output {
    private static String SAVE_FILE_PATH = System.getProperty("user.dir") + File.separator + "studentFile" + File.separator;
    private String fileName = "";

    public String getFileName() {
        return fileName;
    }

    /**
     * 设置保存文件名
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void process(List<Student> students) {
        String csvFilePath = SAVE_FILE_PATH + fileName;
        try {
            CsvWriter csvWriter = new CsvWriter(csvFilePath, ',', Charset.forName("UTF-8"));
            String[] csvHeaders = { "学号", "姓名", "年龄", "成绩"};
            csvWriter.writeRecord(csvHeaders);
            for (Student student:students){
                String[] csvContent = {String.valueOf(student.getId()),student.getName(),String.valueOf(student.getAge()),String.valueOf(student.getScore())};
                csvWriter.writeRecord(csvContent);
            }
            csvWriter.close();
            System.out.println("排序后保存CSV文件成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
