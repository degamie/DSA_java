//WID(Sarthak Mittal(DegamieSIgn)(ConecurrentHashMaps)
package DSA_java.src.hashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args){
        ConcurrentHashMap<Integer,String>chm=new ConcurrentHashMap<>();
        chm.put(1,"Sarthak");
        chm.put(2,"Mittal");
        chm.put(3,"Game Developer");
        chm.put(4,"Hey!");
        System.out.println(chm);
        chm.replace(4,"Hello!");
        System.out.println(chm);
    }


}
