package Polymorfizmus;

public class B extends A implements I3{
    public B() {
        System.out.println("And");
    }
    public B(String text) {
        this();
        System.out.print("is"+text);
    }
    public B(String text, int x) {
        this();
        System.out.print("Constructor"+text+"B"+x);
    }
    @Override
    public void print(){
        System.out.print("sad");
    }

    @Override
    public void wildAnimal() {
        System.out.println();
    }
    public void PRL(){
        System.out.println("C#");
    }
}