//WID(31/7/2026)(Sarthak Mittal(DegamieSign)
package DSA_java.src;

import DSA_java.src.hashMap.ConcurrentHashMaps;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashSets {
    public static void main(String[] args){
        Set<String>concurrenthashSets= ConcurrentHashMap.newKeySet();
        concurrenthashSets.add("Java");
        concurrenthashSets.add("Dev");
        concurrenthashSets.add("2026");
        System.out.println(concurrenthashSets);

    }
}
