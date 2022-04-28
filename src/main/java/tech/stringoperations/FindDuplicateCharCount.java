package tech.stringoperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharCount {

    public void DuplCharCnt(String str1){

        String str = str1.toLowerCase();
        char [] chars = str.toCharArray();
        HashMap<Character, Integer> charmap=new HashMap<Character, Integer>();

        for (char c: chars){

            if (charmap.containsKey(c)){
                charmap.put(c,charmap.get(c)+1);
            } else{
                charmap.put(c,1);
            }
        }

        Set<Character> keys=charmap.keySet();

        for (Character ch: keys ){
            if (charmap.get(ch) > 1){
                System.out.println("The duplicate charactor "+ch+" appeared "+charmap.get(ch)+" Times");
            }
        }

    }
    public static void main(String[] args) {
        FindDuplicateCharCount FD = new FindDuplicateCharCount();
        FD.DuplCharCnt("HHi how are you");

    }


}
