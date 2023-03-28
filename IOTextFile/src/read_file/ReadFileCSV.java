package read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static final String FILE_PATH = "C:\\Users\\Thu Nguyen\\IdeaProjects\\IOTextFile\\src\\read_file\\country.csv";

    public static List<Country> readFileCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        List<Country> countryList = new ArrayList<>();
        String line = "";
        String temp[];
        Country country;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[2];
            String name = temp[3];

            country = new Country(id, code, name);
            countryList.add(country);
        }
        buff.close();
        return countryList;
    }

    public static void writeCSV(Country country) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(country.getId() + "," + country.getCode() + "," + country.getName() + "\n");
        buff.close();
    }

    public static void main(String[] args) throws IOException {
        List<Country> countryList = readFileCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
