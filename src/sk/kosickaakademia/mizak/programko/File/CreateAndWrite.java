package sk.kosickaakademia.mizak.programko.File;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateAndWrite{


    public void CreateAndWriteProgram(String fileName) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("hh-mm-ss");
                Date curDate = new Date();
                String strDate = sdf.format(curDate);
                fileName = strDate+".txt";
                File myFile = new File(fileName);
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }try {
                FileWriter myWriter = new FileWriter(fileName);
                myWriter.write("hovno");

                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                File myFile = new File(fileName);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
