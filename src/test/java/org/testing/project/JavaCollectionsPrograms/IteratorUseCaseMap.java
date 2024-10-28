package org.testing.project.JavaCollectionsPrograms;
import java.util.*;

public class IteratorUseCaseMap {
    public static void main(String[] args) throws Exception {
    //Remove Duplicate words in a sentence using Set

    String str = "im a java programmer with java knowledge with python";
    String arr[] = str.split("\\s");
//    Set<String> set = new HashSet<>();
//    Set<String> set = new TreeSet<>();// for output in assending order for numbers preferred
        Set<String> set = new LinkedHashSet<>();// For strings in insertion order
    for(String s:arr){
        set.add(s);
    }

    Iterator it = set.iterator();
            while (it.hasNext()) {
                System.out.print(it.next()+" ");
            }
        System.out.println();
        System.out.println(set);

    }
}
