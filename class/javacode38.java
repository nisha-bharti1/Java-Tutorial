import java.util.*;

class person{

 String Name;
private int Age;

// public person(String name, int age){
//     this.Name = name;
//     this.Age = age;
// }

public String getName(){
    return Name;
}

}

public class javacode38{
    public static void main(String[] args){
        person p=new person();
        // person p=new person("Nisha",20);
        p.Name="Geeta";
        System.out.println(p.getName());

    }
}