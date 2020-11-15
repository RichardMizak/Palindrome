package Polymorfizmus;

public class Main {
    public static void main(String[] args) {
/*B p1=new B();
p1.print();
A p2=new C();
p2.print();
((C)p2).PRL();
A p3=new A();
p3.wildAnimal();
        I2 p4=new B();
        p4.wildAnimal();
        ((B) p4).print();
        C p5=new C();
        p5.print();*/
        A p6=new A("auto","dom");
        p6.print();
        A p7=new A("x","y",5,9);
        B p8=new B("x",2);
        I2 p9=new B();
        p9.wildAnimal();


    }
}