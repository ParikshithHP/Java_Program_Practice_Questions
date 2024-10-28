package org.testing.project.JavaCollectionsPrograms;
import java.util.*;

public class DuplicatesInArrayUsingSet {
    public static void main(String[] args){
        //using brut force method with for loop
        int arr[] = {1,2,3,4,5,6,3,2,7,8,6,9,5,5};
        Set<Integer> set = new HashSet<>();
        System.out.print("Duplicate Element found:");
        for(int i:arr){
            if(!set.add(i)){
                System.out.print(i+",");
            }
        }
    }
}
