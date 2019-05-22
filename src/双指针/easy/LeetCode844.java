package 双指针.easy;

import java.util.Stack;

public class LeetCode844 {
    class Solution {
        /**
         * 执行用时 : 4 ms, 在Backspace String Compare的Java提交中击败了88.83% 的用户
         * 内存消耗 : 33.9 MB, 在Backspace String Compare的Java提交中击败了89.97% 的用户
         * */
        public boolean backspaceCompare(String S, String T) {
            Stack<Character> s = new Stack<>();
            Stack<Character> t = new Stack<>();
            char[] slist = S.toCharArray();
            char[] tlist = T.toCharArray();
            countStack(slist,s);
            countStack(tlist,t);
            if(s.size() != t.size()){
                return false;
            }else{
                while (!s.isEmpty() && !t.isEmpty()){
                    if(!s.pop().equals(t.pop())){
                        return false;
                    }
                }
            }
            return true;
        }
        public void countStack(char[] slist,Stack<Character> s){
            for (char x:slist) {
                if(x!='#'){
                    s.push(x);
                }else{
                    //当连续弹出元素时，必须进行判断
                    if(!s.isEmpty()){
                        s.pop();
                    }
                }
            }
        }
    }
}
