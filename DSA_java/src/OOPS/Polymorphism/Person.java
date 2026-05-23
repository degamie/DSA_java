//WID(23/05/2026)(Sarthak Mittal)(DegamieSign)#1
package OOPS.Polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Streams extends  Person{
    public Streams(String id, String name, String gender, int age) {
        super(id, name, gender, age);
    }

    public static void main(String[] args){
        Person p=new Person();
        ArrayList<String> arrlist=new ArrayList<>();
        arrlist.add("Sarthak");
        arrlist.add("Mittal");
        arrlist.add("DegamieSign");
        arrlist.add("GameDev");
        arrlist.add("Java FSD");
        arrlist.add("2026");
        Stream stream= arrlist.stream()
                .filter(a -> a.startsWith("S"))
                .distinct()
                .sorted()
                .parallel()
               ;

//                .flatMap("Sarthak".contains(p.getName())
        System.out.println(arrlist);
//        arrlist.getFirst();


    }
}
public class Person {   
    String Id;
    String name;
    String gender;
    int age;

    public Person(String id, String name, String gender, int age) {
        Id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

//Streams 