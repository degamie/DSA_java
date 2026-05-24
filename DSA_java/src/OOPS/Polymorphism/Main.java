//Core Java's Polymorphism 2026(Developed By Sarthak Mittal(DegamieSign))#1(21.05.2026)
package OOPS.Polymorphism;
//Method Overloading (Polymorphism) provides same method declare with different Impl


public class Main{//Main cls and method declare
    public void main(String[] args) {
        //Animal's obj declare and Sound Call
        Animal animal=new Animal();
        animal.speak();
        animal.eat();
        animal.listen();
        //Lion's obj declare and Sound Call
        Animal lion=new Lion();
//        Animal lion = new Animal();
        lion.speak();
        lion.eat();
        lion.listen();
        //Tiger's obj declare and Sound Call
        Animal tiger = new Tiger();
        tiger.speak();
        tiger.eat();
        tiger.listen();

        //seahorse's obj declare and Sound Call
        Animal seahorse = new SeaHorse();
        seahorse.speak();
        seahorse.eat();
        seahorse.listen();

    }
}


class Animal  implements Animals {//Animal Class Declare(parent Cls)

    @Override
    public void listen() {
        System.out.println("Animal is listening");
    }
@Override
public void speak() {
            System.out.println("Animal Speaks");//Animal is speaking
        }

    @Override
    public void eat() {
        System.out.println("Animal is Eating");
    }
}

    class SeaHorse extends Animal implements Animals {//Seahorse inheriting Animal cls
        @Override
        public void eat() {
            System.out.println("SeaHorse is Eating");
        }
        @Override
        public void listen() {
            System.out.println("SeaHorse is listening");
        }

        @Override//overiding speak  SeaHorse's Animal sound
        public void speak() {
            System.out.println("SeaHorse's Sound");
        }

    }

    class Tiger extends Animal implements  Animals {//Tiger Class inheriting Animal cls
        @Override
        public void listen() {
            System.out.println("Animal is listening");
        }

        //Main mehtod's Impl
        @Override//overiding speak  Tiger's Animal sound
       public void speak() {
            System.out.println("Tiger's Sound");
        }
        @Override
        public void eat() {
            System.out.println("Tiger is Eating");
        }

    }

    class Lion extends Animal implements Animals {//Parent Class Declare

        @Override
        public void listen() {
            System.out.println("Animal is listening");
        }

        @Override//overiding speak  Tiger's Animal sound
        public void speak() {
            System.out.println("Lion's Sound");
        }
    }
