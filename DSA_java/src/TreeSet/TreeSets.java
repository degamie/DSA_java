//WID(30/5/2026)(Sarthak Mittal)(DegamieSign)#1
package TreeSet;

import java.util.TreeSet;

//T(C(N)==O(1) and S(C(N)==O(N) as it requires dynamic space alloc in const time
public class TreeSets {
   public static  void main(String[] args){
       TreeSet<String> ts1=new TreeSet<>();//Treeset declare
       //Adding TReeSet elements

       ts1.add("Java");
       ts1.add("SQL");
       ts1.add("Core_Java");
       ts1.add("Advanced_Java");
       ts1.add("Hibernate_ORM");
       ts1.add("Spring");
       ts1.add("SpringMVC");
       ts1.add("SpringBoot");
       ts1.add("micoservices");
       ts1.add("LibGDX");
       ts1.add("JavaFX");
       //printing output
       System.out.println(ts1);
       //dealloctiing treeset'e s current elements
       ts1.remove("SQL");
       System.out.println(ts1);

       ts1.remove("Hibernate_ORM");
       System.out.println(ts1);

       ts1.remove("Spring");
       System.out.println(ts1);

       ts1.remove("JavaFX");
       System.out.println(ts1);
       //Adding TreeSet's New Elements

       ts1.add("SpringAI");
       System.out.println(ts1);
       ts1.add("FireBaseDB");
       System.out.println(ts1);
       ts1.contains("LibGDX");
       //Printing new Addeed treeset elem with its subset's 1st nd last elemnets
       System.out.println(ts1.subSet("Java","SpringBoot"));
   }
}