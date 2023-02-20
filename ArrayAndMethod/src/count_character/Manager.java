package count_character;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        int count = 0;
        String str = "CodeGym Da Nang!";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input character: ");
        char character = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.println(count);
    }
}
