import java.util.*;

class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }

}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog bark");
    }
}

public class javacode39{
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.eat();
        d1.bark();
    }
}