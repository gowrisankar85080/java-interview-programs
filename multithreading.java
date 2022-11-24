import java.util.*;
class Book extends Thread {
   public void run(){
    for(int i=0;i<5;i++){
        System.out.println("hello");
        try{Thread.sleep(5000);} catch(InterruptedException e){}
    }
}
}
class Num {
    void Num(){
    for(int i=0;i<5;i++){
        System.out.println(i);
    }
}
}
public class multithreading   {
    public static void main(String[] args) throws InterruptedException {
        Book obj1 = new Book();
        Num obj2 = new Num();
        obj1.start();
        obj1.join();
        obj2.Num();
    }
}