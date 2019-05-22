package 牛客网;

import java.util.Scanner;

public class p3 {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        byte[][] path = new byte[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n ; j++) {
                path[i][j] = sc.nextByte();
                if(path[i][j] == '*'){
                    x = i;
                    y = j;
                }
            }
        }


    }
    public static int findPath(byte[][] path,int x,int y){
        if(x < 0 ||y < 0 || x > path.length-1 || y >path.length-1 || path[x][y] == '#'){
            return 0;
        }
        if(path[x][y] == '@'){
        }
        return findPath(path,x+1,y);
    }

}
