package 牛客网;

import java.util.Scanner;

public class p1 {
    /**
     *
     3 5 7
     2 6 8
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int[] list = new int[13];
        for (int i = 0; i <list.length ; i++) {
            list[i] = 4;
        }
        list[a1]--;
        list[a2]--;
        list[a3]--;
        list[b1]--;
        list[b2]--;
        list[b3]--;
        System.out.print(count(list,a1,a2,a3,b1,b2,b3));

    }
    public static double count(int[] list,int a1,int a2,int a3,int b1,int b2,int b3){
        double result = 0;
        int countA = a1+a2+a3;
        int countB = b1+b2+b3;
        int cha = countA - countB;
        if(cha > 13){
            result = 1.0;
        }else if(cha < -13){
            result = 0;
        }else{
            result = result(list,cha);
        }
        return result;
    }
    public static double result(int[] list,int cha){
        int count = 0;
        //牛牛
        int[] p = new int[46];
        int j = 0;
        for (int i = 0; i <list.length ; i++) {
            for (int k = 0; k <list[i] ; k++) {
                p[j++] = i;
            }
        }
        for (int i = 0; i <46 ; i++) {
            for (int k = 0; k <46 ; k++) {
                if(p[i] - p[k] > cha && k != i){
                    count++;
                }
            }
        }
        System.out.println(count*1.000/(23*45));
        return count/(23*45);
    }
}
