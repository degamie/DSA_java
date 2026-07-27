//WID(Sarthak Mittal(DegameiSign)(4/7/2026)(HashMap).1
package hashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// (key Char(Practical)(Working (HashMaps))
public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> h2 = new HashMap();//HasHMap declare
        //Insertion
        h2.put(1, "Sarthak");
        h2.put(2, "Mittal");
        h2.put(3, "2026");
        h2.put(4,"Degamie");
        h2.put(5,"Sign");
        //KeySet Impl
        Set<Integer> s1 = h2.keySet();
        for (int i : s1) {//Iterating  hashMap's Keys val Pairs
            System.out.println(h2.get(i));//Printing hashMap's indxes
        }
        System.out.println(h2.containsKey(2));//Printing True to HashMap's Current's contained Key
        System.out.println(h2);//Printing hashMap's Keys val Pairs

        Set<Map.Entry<Integer,String>>smap=h2.entrySet();//HashMap's EntrySet declare
        for(Map.Entry<Integer,String> entry:smap){//EntrySet's Itertation
            System.out.println(entry.getKey()+":"+entry.getValue());//Printing EntrySet's key-Val pairs
            System.out.println(entry.getKey()+":"+entry.getValue().toUpperCase());//Printing EntrySet's key-Val pairs in UpperCas

        }
    }
}
        //Remove    Oper

//        System.out.println(h2.remove(5,"Sign"));//Printing Removed Key Value Pair and Checking its Truth 's removed Val

//        System.out.println(h2.remove(5));//Removing Key and Printing its Val in HashMap



//        hashMap.containsKey(2);

        //HashMap's (bucket) declare
//        HashMap<String,String>hashMap=new HashMap<>();
//        HashMap<String,Integer>h1=new HashMap<>();
//        hashMap.put("Sarthak","Mittal");
//        //Fetching h1's Vals
//        h1.put("Degamie",1);
//        h1.put("Sign",2);
//        h1.put("Game ",4);
//        h1.put("Developer",5);
//        h1.values();
//        System.out.println(h1);
//
//        h1.get(1);
//        h1.get(2);
//        h1.get(4);
//        h1.get(5);

//        hashMap.containsKey(1);
//        System.out.println(h1);
//        System.out.println(hashMap);
//         String key=null;String val=null;


//        for(int i:s1.size()){


    //entrySet() impl
//        for(Map.Entry<String,String>entry:hashMap.entrySet()){
//        key=entry.getKey();
//        val=entry.getValue();
//        System.out.println("Key"+key+"Val"+val);
//    }
