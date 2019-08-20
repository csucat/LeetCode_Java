package 递归.mid;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode894 {
    class Solution {
        int count;
        List<TreeNode> list = new ArrayList<>();
        public List<TreeNode> allPossibleFBT(int N) {
            if(N%2 == 0){
                return null;
            }
            count = N;
            TreeNode root = new TreeNode(0);
            count--;


            return list;
        }
    }
}
