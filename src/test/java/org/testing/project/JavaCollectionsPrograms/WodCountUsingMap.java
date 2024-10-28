package org.testing.project.JavaCollectionsPrograms;
import java.util.*;
public class WodCountUsingMap {
    public static void main(String[] args) throws Exception {

        String str = "im a java and python programmer with java and python knowledge ";

        String arr[] = str.split("\\s");

        Map<String,Integer> map = new HashMap<>();
//        Map<String,Integer> map = new LinkedHashMap<>(); // for sorted output and it preserves insertion order
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(String c:map.keySet()){
            System.out.println("Word:"+c+" is repeated: "+map.get(c)+" Times");
        }
    }
}
