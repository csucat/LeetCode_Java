package 精选面试题;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242 {
    /**
     * 执行用时 :57 ms, 在所有 Java 提交中击败了14.51% 的用户
     * 内存消耗 :43.3 MB, 在所有 Java 提交中击败了14.71%的用户
     * */
    class Solution {
        public boolean isAnagram(String s, String t) {
            Map<Character,Integer> maps = new HashMap<>();
            Map<Character,Integer> mapt = new HashMap<>();
            toMap(s,maps);
            toMap(t,mapt);
            if(judge(maps,mapt)){
                return true;
            }else {
                return false;
            }
        }
        public void toMap(String s,Map map){
            char[] list = s.toCharArray();
            for (char x:list) {
                if(!map.containsKey(x)){
                    map.put(x,1);
                }else {
                    int time = (Integer) map.get(x);
                    time++;
                    map.put(x,time);
                }
            }
        }
        public boolean judge(Map<Character,Integer> maps,Map<Character,Integer> mapt){
            if(maps.size() != mapt.size()){
                return false;
            }
            for (Character x:maps.keySet()) {
                int s = maps.get(x);
                if(mapt.containsKey(x)){
                    int t = mapt.get(x);
                    if(s != t){
                        return false;
                    }else{
                        continue;
                    }
                }else {
                    return false;
                }

            }
            return true;
        }

    }
}
