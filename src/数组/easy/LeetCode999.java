package 数组.easy;

public class LeetCode999 {
    class Solution {
        /**
         * 执行用时 : 1 ms, 在Available Captures for Rook的Java提交中击败了63.02% 的用户
         * 内存消耗 : 33.6 MB, 在Available Captures for Rook的Java提交中击败了82.21% 的用户
         * */
        public int numRookCaptures(char[][] board) {
            int xR = 0;
            int yR = 0;
            int count = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 'R') {
                        xR = i;
                        yR = j;
                    }
                }
            }
            //扫描左边
            for (int i = yR - 1; i >= 0; i--) {
                if (board[xR][i] == 'p') {
                    count++;
                    break;
                } else if (board[xR][i] == 'B') break;
            }
            //扫描上边
            for (int i = xR - 1; i >= 0; i--) {
                if (board[i][yR] == 'p') {
                    count++;
                    break;
                } else if (board[i][yR] == 'B') break;
            }
            //扫描右边
            for (int i = yR + 1; i < board.length; i++) {
                if (board[xR][i] == 'p') {
                    count++;
                    break;
                } else if (board[xR][i] == 'B') break;
            }
            //扫描下边
            for (int i = xR + 1; i < board.length; i++) {
                if (board[i][yR] == 'p') {
                    count++;
                    break;
                } else if (board[i][yR] == 'B') break;
            }
            return count;

        }
    }
}
