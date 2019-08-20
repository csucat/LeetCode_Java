package 华为;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] Lables = new int[M];
        int[] HasChild = new int[M];
        int[] POUDS = new int[M];
        for (int i = 0; i < M; i++) {
            Lables[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            HasChild[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            POUDS[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        int[] Values = new int[N];
        for (int i = 0; i < N; i++) {
            Values[i] = sc.nextInt();
        }
        int P = sc.nextInt();
        int[] key = new int[P];
        for (int i = 0; i < P; i++) {
            key[i] = sc.nextInt();
        }

        for (int j = M - 1; j >= 0; j--) {
            if (Lables[j] == key[0]) {
                if (HasChild[j] == 1) {
                    for (int k = j; k >= 0; k--) {
                        if (POUDS[k] == 1) {
                            if (k > 0) {
                                System.out.println(7);
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println(0);
                    break;
                }
            }
        }

        System.out.println(0);
    }
}
