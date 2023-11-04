package 자료구조;

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String numString = scanner.next();
        int totalSum = 0;

        char[] strArray = numString.toCharArray();

        for (int i = 0; i < numString.length(); i++){
            totalSum += strArray[i] - '0';
        }
        System.out.println(totalSum);
    }
}
