package the_most_appearing_letter;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        /*codes below here */

        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            int ascii = (int) inputString.charAt(i);               //{3}
            frequentChar[ascii] += 1;                              //{4}
        }
        int max = 0;                                             //{5}
        char character = (char) 255; /* empty character */      //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}

/* Tính độ phức tạp:
-------------------------------------------------
- Thời  gian thực hiện lệnh {1}là O(1)
Hai lệnh gán {3} và {4} đều tốn O(1) thời gian. Vòng lặp {2} thực hiện (n) lần,
mỗi lần O(1) do đó vòng lặp {2} tốn O((n).1) = O(n)  với  n là độ dài chuỗi ký tự.
- Thời  gian thực hiện lệnh {5} và {6} đều là O(1)
Hai lệnh gán {9} và {10} đều tốn O(1) thời gian, việc so sánh frequentChar[j] > max  cũng tốn O(1) thời gian,
do đó lệnh {8} tốn O(1) thời gian. Vòng lặp {7} thực hiện (255) lần, mỗi lần O(1) do đó vòng lặp {7} tốn O((255).1) = O(255).
*/
