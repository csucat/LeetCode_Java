package 贝壳找房;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
        }
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int max = 0;
        for (int i = n - 1; i > 0; i--) {
            int t = list[i];
            int index = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (list[j] < 0.9 * t) {
                    index = j;
                    break;
                }
            }
            if (i - index >= 1) {
                max = Math.max(i - index + 1, max);
            }
        }
        System.out.println(max * (max - 1) / 2);
    }
}