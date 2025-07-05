import java.util.*;


class outer{
    void outermethod(){
        int num =5;

            class localinner{
            void show(){
                System.out.println("num = " + num);
            }
        }

        localinner inner = new localinner();
        inner.show();
    }

}


public class javacode53{
    public static void main(String args[])
    {
        outer out = new outer();
         out.outermethod();

    }
}