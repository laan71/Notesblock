package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// CRUD for notesblock
public class FileHandling {

    public static void createFile(String fileName){ // FileHandling f = new FileHandling(); f.createFile("Hest.txt"); f.createFile("Ost.html");
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
     /*   try {

            FileWriter readFile = new FileWriter(fileName);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } */
    }

    public static void updateFile(String fileName, String fileContent) { // Både filnavn og indhold skal være argument
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(fileContent);
            myWriter.close();
            System.out.println("You successfully updated the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        try {
            // Tanker på delete funktion endnu ikke færdig
         //   FileWriter deleteFile = new FileWriter(fileName);

            File myObj = new File(fileName);
            if (myObj.delete()) {
                System.out.println("You successfully deleted the file: " + myObj.getName());
            }
        } catch(Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
