package com.example.filemodel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCtr {



  static  void checkSequenceFiles() throws IOException {
        String path = "C:\\Users\\james.keogh\\Desktop\\templates\\Java.fx\\";
        String filename = "out";
        String extension = ".wav";

        int versionNumber = 0;
        String fileOut = path + filename + extension;
        File file = new File(fileOut);

        while (file.exists()) {
            System.out.println("file exists");
            versionNumber++;
            fileOut = path + filename + "(" + versionNumber + ")" + extension;
            file = new File(fileOut);
        }

        System.out.println("file out " + fileOut);
        //  FileWriter fileWriter = new FileWriter(fileOut);
        new FileWriter (fileOut);
    }


}
