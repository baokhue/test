package copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static final String FILE_SOURCE = "C:\\Users\\Thu Nguyen\\IdeaProjects\\IOTextFile\\src\\copy_file\\sourceFile.csv";
    public static final String FILE_TARGET = "C:\\Users\\Thu Nguyen\\IdeaProjects\\IOTextFile\\src\\copy_file\\targetFile.csv";

    public static List<Furniture> readFile() throws IOException {
        /*FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(FILE_SOURCE);
            out = new FileWriter(FILE_TARGET);

            int c;

            while ((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }*/

        FileReader fileReader = new FileReader(FILE_SOURCE);
        BufferedReader buff = new BufferedReader(fileReader);

        List<Furniture> furnitureList = new ArrayList<>();
        String line = "";
        String temp[];
        Furniture furniture;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            double price = Double.parseDouble(temp[2]);
            String currency = temp[3];

            furniture = new Furniture(id, name, price, currency);
            furnitureList.add(furniture);
        }
        buff.close();
        return furnitureList;
    }

    public static void writeFile(Furniture furniture) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_SOURCE, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(furniture.getId() + "," + furniture.getName() + "," + furniture.getPrice() + "," + furniture.getCurrency() + "\n");
        buff.close();
    }

    /*public static void copyFile() throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(FILE_SOURCE);
            out = new FileWriter(FILE_TARGET);

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }*/

    public static void main(String[] args) throws IOException {
        copyFile(FILE_SOURCE, FILE_TARGET);
    }

    private static void copyFile(String FILE_SOURCE, String FILE_TARGET) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(FILE_SOURCE);
            out = new FileWriter(FILE_TARGET);

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }

}
