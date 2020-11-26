package Polymorfizmus;

public class Main {
    public static void main(String[] args) {

First p1=new First();
p1.Cars();
First p2=new First(8,2,9);
p2.Rnumbers();
First p3=new Second();
p3.Rnumbers();
Second p4=new Second();
p4.Game();
Second p5=new Second();
p5.wildAnimal();


    }
}