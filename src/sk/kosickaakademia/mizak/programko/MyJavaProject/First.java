package Polymorfizmus;


import java.util.ArrayList;

public class First {

    public First() {
        System.out.println("Cars");
        Cars();
    }

    public First(int x, int y){
        this();
        int sum=x*y;
        System.out.println(x+"*"+y+"="+sum);
        Rnumbers();
    }
    public First(int x, int y, int z){
        this(x, y);
        mynumber();
    }

    private void mynumber() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public void Rnumbers() {
        System.out.println("Random number: "+Math.random());
    }

    public static void Cars(){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Lada");
    cars.add("Gaz");
    cars.add("Fiat");
    cars.add("Tatra");
    System.out.println(cars);
}


}
