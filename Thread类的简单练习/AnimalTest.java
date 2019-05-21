package DemoThread;

import sun.security.x509.CertAttrSet;

class Cat extends Thread{
    public void run(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("A Cat!");
        }
    }
}

class Dog extends Thread{
    public void run(){
        for (int i = 0; i <3 ; i++) {
            System.out.println("A Dog!");
        }
    }
}

public class AnimalTest extends Thread  {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.start();
        Dog dog=new Dog();
        dog.start();

        for (int i = 0; i <3 ; i++) {
            System.out.println("main Thread!");
        }
    }
}
