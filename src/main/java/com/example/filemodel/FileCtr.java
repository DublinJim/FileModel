package com.example.filemodel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCtr {

    static String fileOut = "blank";
    static String filename = "out";
    static String extension = ".wav";
    static int versionNumber = 0;

    public FileCtr() {
    }


    static void checkSequenceFiles() throws IOException {
        String path = "C:\\Users\\james.keogh\\Desktop\\templates\\Java.fx\\";

        fileOut = (path + filename + extension);

        File file = new File(fileOut);

        while (file.exists()) {
            System.out.println("file exists");

            versionNumber++;
            fileOut = path + filename + "(" + versionNumber + ")" + extension;
            file = new File(fileOut);
        }

        System.out.println("file out " + fileOut);
        new FileWriter(fileOut);


    }


    public static String checkFileExists() {
        return filename + extension;
    }

    public static String fileToWrite() {
        return filename + "(" + versionNumber + ")" + extension;
    }

}
