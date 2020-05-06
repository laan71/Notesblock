package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// CRUD for notesblock
public class FileHandling {

    public static void CreateFile(){
        try {
            File myObj = new File("filename.txt");
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

    public static void ReadFile(String[] args) {
        try {
        // @TODO
            FileWriter readFile = new FileWriter("filename.txt");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void UpdateFile(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("java");
            myWriter.close();
            System.out.println("You successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void DeleteFile(String[] args) {
        try {
            // Tanker på delete funktion endnu ikke færdig
            FileWriter deleteFile = new FileWriter("filename.txt");

            File myObj = new File("filename.txt");
            if (myObj.delete()) {
                System.out.println("You successfully deleted the file: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
