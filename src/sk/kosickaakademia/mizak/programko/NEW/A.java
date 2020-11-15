package Polymorfizmus;

public class A implements I2{
    public A() {
        System.out.println("this");
        int number = 40;
    }
    public A(String text) {
        this();
        System.out.print("is");
    }
    public A(String text, String name){
        this(text);
        System.out.print("constructor "+name+" "+text);
    }
    public A(String text, String name, int x, int y){
        this(text);
        int sum=x*y;
        System.out.print(name+" A "+text+" "+sum);
    }
    @Override
    public void animal() {
        System.out.println("cat");
    }

    public void print(){
         System.out.println("A");

     }
}