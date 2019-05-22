package 牛客网;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] star = new boolean[1001][1001];
        for (int i = 1; i <= n ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            star[x][y] = true;
        }
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            list.add(count(star,x,y,x1,y1));
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
    public static int count(boolean[][] star,int x,int y,int m,int n){
        int count = 0;
        for (int i = 0; i <star.length ; i++) {
            for (int j = 0; j <star[0].length ; j++) {
                if(star[i][j] && i>=x && i<=m && j>=y && j<=n){
                    count++;
                }
            }
        }
        return count;
    }

}
