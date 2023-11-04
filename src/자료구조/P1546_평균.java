package 자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] scoreList = new long[N];
        for (int i = 0; i < N; i++) {
            long score = scanner.nextLong();
            scoreList[i] = score;
        }

        long sum = 0;
        long maxScore = Arrays.stream(scoreList).max().getAsLong();

        for (int i = 0; i < N; i++) {
            sum += scoreList[i];
        }

        System.out.println(sum / maxScore * 100.0 / N);
    }
}