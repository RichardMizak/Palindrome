package Polymorfizmus;

public interface I2 extends I1 {

    public void animal();

    default public void wildAnimal(){
        System.out.println("snake");
    }
}
