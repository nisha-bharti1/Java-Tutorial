import java.util.*;

abstract class Animal{
    String Name;

    Animal(String name){
        this.Name=name;
    }

    abstract void sound();

    void eat(){
        System.out.println(Name + " eats food.");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    void sound(){
        System.out.println(Name + "barks.");
    }
}


public class Abstract{
    public static void main(String args[]){
        Dog d=new Dog("Tommy");
        d.sound();
        d.eat();
    }
}