//Core Java's Polymorphism 2026(Developed By Sarthak Mittal(DegamieSign))#1(21.05.2026)
package OOPS.Polymorphism;
//Method Overloading (Polymorphism) provides same method declare with different Impl


public class Main{//Main cls and method declare
    public void main(String[] args) {
        //Animal's obj declare and Sound Call
        Animal animal=new Animal();
        animal.speak();
        //Lion's obj declare and Sound Call
        Animal lion=new Lion();
//        Animal lion = new Animal();
        lion.speak();
        //Tiger's obj declare and Sound Call
        Animal tiger = new Tiger();
        tiger.speak();
        //seahorse's obj declare and Sound Call
        Animal seahorse = new SeaHorse();
        seahorse.speak();
    }
}


class Animal   {//Animal Class Declare(parent Cls)
        void speak() {
            System.out.println("Animal Speaks");//Animal is speaking
        }
    }

    class SeaHorse extends Animal {//Seahorse inheriting Animal cls

        @Override//overiding speak  SeaHorse's Animal sound
        public void speak() {
            System.out.println("SeaHorse's Sound");
        }

    }

    class Tiger extends Animal {//Tiger Class inheriting Animal cls

        //Main mehtod's Impl
        @Override//overiding speak  Tiger's Animal sound
       public void speak() {
            System.out.println("Tiger's Sound");
        }
    }

    class Lion extends Animal {//Parent Class Declare
        @Override//overiding speak  Tiger's Animal sound
        public void speak() {
            System.out.println("Lion's Sound");
        }
    }