package day12DataStructuresJavaCollectionFramework.TH1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        Map<String, Integer> hasMap = new HashMap<>();
//        hasMap.put("Smith", 30);
//        hasMap.put("Anderson", 30);
//        hasMap.put("Lewis", 29);
//        hasMap.put("Cook", 29);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hasMap + "\n");
//        System.out.println("------------------------");

        Map<String,Integer> treMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key ");
        System.out.println(treMap);
        System.out.println("--------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Smith"));
    }
}
