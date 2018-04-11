package com.zet.utils;

import java.io.*;
import java.util.List;
/**
 * @Auther: TianW
 * @Date: 2018/4/11 16:57
 * @Description:
 */
public class ListUtil {
    public static <T> List<T> deepCopy(List<T> src){
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        List<T> dest = null;
        try {
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(src);
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            dest = (List<T>) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dest;
    }
}