package 网易;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int[] list = new int[n];
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = sc.nextInt();
                array[i] = list[i];
            }
            Arrays.sort(array);
            int q = sc.nextInt();
            if (q > 0) {
                int[] ask = new int[q];
                //成绩
                int[] people = new int[q];
                for (int i = 0; i < q; i++) {
                    ask[i] = sc.nextInt();
                    people[i] = list[ask[i] - 1];
                }
                double[] result = new double[q];
                for (int i = 0; i < q; i++) {
                    int index = 0;
                    for (int j = array.length - 1; j >= 0; j--) {
                        if (array[j] == people[i]) {
                            index = j;
                            break;
                        }
                    }
                    result[i] = ((index) * 1.0 / n) * 100;

                    System.out.println(String.format("%.6f", result[i]));
                }
            }
        } else {
            throw new Exception("error");
        }
    }
}
