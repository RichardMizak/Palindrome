package Polymorfizmus;

import java.util.Random;

public class Second extends First implements I1 {
    public Second() {
        System.out.println("And");
        triangle();
    }
    public Second(String text) {
        this();
        System.out.print("is"+text);
        Game();
    }

    public void Game() {
        Random rand = new Random();
        int n = rand.nextInt(5);
        switch (n){
            case 0:
                System.out.println("My favourite game is DOOM");
                break;
            case 1:
                System.out.println("My favourite game is FF7");
                break;
            case 2:
                System.out.println("My favourite game is NFS MW");
                break;
            case 3:
                System.out.println("My favourite game is WC3");
                break;
            case 4:
                System.out.println("My favourite game is WoT");
                break;
            }
        }
    private void triangle() {
        int a=3;
        int b=4;
        int c=5;
        if (a*a+b*b==c*c){
            System.out.println("This is triangle");
        }else{
            System.out.println("This is not triangle");
        }
    }

    @Override
    public void animal() {
        System.out.println("Lion");
    }

    @Override
    public void wildAnimal() {
        System.out.println("Elephant");
    }
}
