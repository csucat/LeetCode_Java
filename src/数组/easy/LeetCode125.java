package 数组.easy;

public class LeetCode125 {
    class Solution {
        //TODO
        public boolean isPalindrome(String s) {
            if(s == null){
                return true;
            }
            char[] list = s.toCharArray();
            int i =0;
            int j = list.length-1;
            int count = 0;
            int k = 0;
            while (k < j){
                if(Character.isLetter(list[k]) || Character.isDigit(list[k])){
                    count++;
                }
                k++;
            }
            if(count == 0){
                return true;
            }
            while (i<j){
                while (i<j && (!Character.isDigit(list[i]) && !Character.isLetter(list[i]))){
                    i++;
                }
                while (i<j && (!Character.isDigit(list[j]) && !Character.isLetter(list[j]))){
                    j--;
                }
                if(!isPalindrome(list[i],list[j])){
                    return false;
                }else {
                    i++;
                    j--;
                }
            }
            return true;
        }
        public boolean isPalindrome(char i,char j){
            if(i == j || i-j == 'A'-'a' || i-j == 'a'-'A'){
                if(Character.isDigit(i) && Character.isDigit(j) ||Character.isLetter(i) && Character.isLetter(j)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
