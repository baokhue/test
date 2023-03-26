package test_file;

import java.io.*;
import java.util.Scanner;

public class Manager {
    public void readFile(String sourceFile, String targetFile) {
        try {
            File sFile = new File(sourceFile);
            File tFile = new File(targetFile);

            if (!sFile.exists() || !tFile.exists()){
                throw new FileNotFoundException();
            }

            // File reader
            FileReader fileReader = new FileReader(sFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // File writer
            FileWriter fileWriter = new FileWriter(tFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("Copy: " + );

            bufferedReader.close();
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input source file: ");
        String sourceFile = sc.nextLine();
        System.out.println("Input target file: ");
        String targetFile = sc.nextLine();

        Manager manager = new Manager();
        manager.readFile(sourceFile, targetFile);
    }
}
