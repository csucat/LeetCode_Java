package 网易;

import java.util.Arrays;
import java.util.Scanner;

public class four {
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n ; i++) {
            list[i] = sc.nextInt();
        }
        int[] move = new int[q];
        for (int i = 0; i < q ; i++) {
            move[i] = sc.nextInt();
        }
        Arrays.sort(list);
        for (int i = 0; i < q ; i++) {
            int index = binarySearch0(list,0,list.length-1,move[i]);
            if(flag){
                System.out.println(list.length+1-index);
                for (int j = index; j < list.length; j++) {
                    list[j] -- ;
                }
                Arrays.sort(list);
                flag = false;
            }else {
                int temp = index;
                for (int j = temp; j >= 0 ; j--) {
                    if(list[j] >= move[i]){
                        index --;
                    }
                }
                System.out.println(list.length+1-index);
                for (int j = index; j < list.length; j++) {
                    list[j] -- ;
                }
                Arrays.sort(list);
            }
        }
    }
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else {
                flag = true;
                return mid; // key found
            }
        }
        return high;  // key not found.
    }

}
