//WID(Sarthak Mittal(DegameiSign)(#1)(26/5/2026)
package hashMap;
import java.util.HashMap;
import java.util.Map;
//Internal Working (HashMaps)
public class HashMaps {
    public static void main(String[] args){
        //HashMap's (bucket) declare
        HashMap<String,String>hashMap=new HashMap<>();
        HashMap<String,Integer>h1=new HashMap<>();
        hashMap.put("Sarthak","Mittal");
        //Fetching h1's Vals
        h1.put("Degamie",1);
        h1.put("Sign",2);
        h1.put("Game ",4);
        h1.put("Developer",5);

        h1.get(1);
        h1.get(2);
        h1.get(4);
        h1.get(5);
hashMap.containsKey(2);
        hashMap.containsKey(1);
        System.out.println(h1);
        System.out.println(hashMap);
         String key=null;String val=null;



     //entrySet() impl
        for(Map.Entry<String,String>entry:hashMap.entrySet()){
            key=entry.getKey();
            val=entry.getValue();
            System.out.println("Key"+key+"Val"+val);
        }
    }
}
