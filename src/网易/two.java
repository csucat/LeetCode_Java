package 网易;

import java.util.Arrays;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int[] list = new int[n];
            for (int j = 0; j < n ; j++) {
                list[j] = sc.nextInt();
            }
            if(judge(list)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
    private static boolean judge(int[] list){
        Arrays.sort(list);
        for (int i = 1; i < list.length-1; i++) {
            if(list[i] < list[i-1] + list[i+1]){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
