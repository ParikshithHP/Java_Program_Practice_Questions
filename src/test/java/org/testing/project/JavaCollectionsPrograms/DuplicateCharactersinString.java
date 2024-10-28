package org.testing.project.JavaCollectionsPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
public class DuplicateCharactersinString {
    public static void main(String[] args){

        String str = "parikshithshetty";

//        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map = new LinkedHashMap<>(); // for sorted output and it preserves insertion order
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        for(char c:map.keySet()){
            if(map.get(c)>1){
                System.out.println("Duplicate Character Found :"+c+" and its repeated: "+map.get(c)+" Times");
            }

        }
    }
}