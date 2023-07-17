package com.zorba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MavenExam {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            fileInputStream = new FileInputStream("/Users/ujjwaltwanabasu/Documents/java Assess/Inntelliz/examJuly16/src/main/resources/mavenfile.txt");
            String inputData = " ";
            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);
                inputData = inputData + (char) c;
            }

            //  inputData = inputData.trim();
            inputData = inputData + " , The total amount is 180 ";
            System.out.println("input Data :: " + inputData);
            fileOutputStream = new FileOutputStream("/Users/ujjwaltwanabasu/Documents/java Assess/Inntelliz/examJuly16/src/main/resources/mavenfileoutput.txt");
            System.out.println("File update succesfully ... ");

            File file = new File("/Users/ujjwaltwanabasu/Documents/java Assess/Inntelliz/examJuly16/src/main/resources/META-INF/maven/finalfile.txt");
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write( inputData.getBytes());
            System.out.println(" File is update in new location name newsam ....");


        }catch (Exception e) {
            System.err.println("Error Message :: " + e.getMessage());
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }




    }
}
