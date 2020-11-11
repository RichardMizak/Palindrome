package sk.kosickaakademia.mizak.programko.File;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class CreateAndWrite {

        public static void main(String[] args) {
            try {
                File myFile = new File("a.txt");
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }try {
                FileWriter myWriter = new FileWriter("a.txt");
                myWriter.write("hovno");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    }

