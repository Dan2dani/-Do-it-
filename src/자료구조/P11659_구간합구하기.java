package 자료구조;

import java.util.Scanner;

public class P11659_구간합구하기 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int sums = 0;
            long[] totalSums = new long[N];

            for (int i = 0; i < totalSums.length; i++) {
                sums += scanner.nextInt();
                totalSums[i] = sums;
            }

            for (int i = 0; i < M; i++) {
                int lower = scanner.nextInt();
                int upper = scanner.nextInt();

                if (lower == 1)
                    System.out.println(totalSums[upper - 1]);
                else
                    System.out.println(totalSums[upper - 1] - totalSums[lower - 2]);
            }
        }
    }
}