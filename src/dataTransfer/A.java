package dataTransfer;

public class A {

    String name = "Pooja";

    public static void main(String[] args) {

        A a = new A();

        B b = new B();

        String result = b.m1(a.name);

        System.out.println(result);
    }
}