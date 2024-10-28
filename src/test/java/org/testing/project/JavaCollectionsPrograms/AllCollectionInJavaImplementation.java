package org.testing.project.JavaCollectionsPrograms;

import java.util.*;

public class AllCollectionInJavaImplementation {

    public static void main(String[] args){
        // List Arraylist implementation
        String arr[] = {"a", "b", "c", "d", "e", "f","a","b"};
        List<String> list = new ArrayList<>();
        for(String x:arr){
            list.add(x);
        }
        System.out.println(list);

        // Set Implementation Removing Duplicates from the list
        Set<String> set = new HashSet<>(list);
        System.out.println(set);

    }
}
