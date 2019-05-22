package 牛客网;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] maps = new char[n][n];
        ArrayList<Point> ins = new ArrayList<>();
        Point end = null;
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            for (int j = 0; j < n; j++) {
                maps[i][j] = temp.charAt(j);
                if (maps[i][j] == '@') {
                    ins.add(new Point(i, j));
                } else if (maps[i][j] == '*') {
                    end = new Point(i, j);
                }
            }
        }
        int[][] res = new int[n][n];
        boolean[][] flag = new boolean[n][n];
        find(res, end, maps, flag);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < ins.size(); i++) {
            Point point = ins.get(i);
            if (res[point.x][point.y] < result) {
                result = res[point.x][point.y];
            }
        }
        System.out.println(result);

    }

    public static void find(int[][] res, Point end, char[][] maps, boolean[][] flag) {

        LinkedList<Point> queue = new LinkedList <>();
        res[end.x][end.y] = 0;
        queue.offer(end);
        while (!queue.isEmpty()) {
            Point dot = queue.poll();
            int x = dot.x;
            int y = dot.y;
            if (calDistance(res, x + 1, y, maps, flag, res[x][y])){
                queue.offer(new Point(x + 1, y));
            }
            if (calDistance(res, x - 1, y, maps, flag, res[x][y])) {
                queue.offer(new Point(x - 1, y));
            }
            if (calDistance(res, x, y + 1, maps, flag, res[x][y])) {
                queue.offer(new Point(x, y + 1));
            }
            if (calDistance(res, x, y - 1, maps, flag, res[x][y])) {
                queue.offer(new Point(x, y - 1));
            }

        }

    }

    private static boolean calDistance(int[][] res, int i, int j, char[][] maps, boolean[][] flag, int val) {

        if (i < 0 || i >= res.length || j < 0 || j >= res.length || flag[i][j] == true || maps[i][j] == '#'){
            return false;
        }
        else {
            res[i][j] = val + 1;
            flag[i][j] = true;
            return true;
        }
    }

}
