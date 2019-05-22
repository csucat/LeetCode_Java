package 数组.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode1002 {
    class Solution {
        //TODO
        public List<String> commonChars(String[] A) {
            List<String> list = new ArrayList<>();
            HashMap<String,Integer> map = new HashMap<>();
            int time = 1;
            if(A.length > 0){
                char[] first = A[0].toCharArray();
                for (char x: first) {
                    String xx = x+"";
                    map.put(xx,time);
                }
            }
            for (int i = 1; i <A.length; i++) {
                char[] temp = A[i].toCharArray();
                for (char x: temp) {
                    String xx = x+"";
                    if(map.containsKey(xx)){
                        int t = map.get(xx);
                        t++;
                        map.put(xx,t);
                    }
                }
            }
            for (String keyset:map.keySet()) {
                int t = map.get(keyset)%A.length;
                int count = map.get(keyset)/A.length;
                if( t == 0){
                    while (t>0){
                        list.add(keyset);
                        t--;
                    }
                }
            }
            return list;
        }
    }
}
