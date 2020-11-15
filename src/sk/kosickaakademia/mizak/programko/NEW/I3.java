package Polymorfizmus;

public interface I3 extends I2{
    public default void animal() {
        System.out.println("cat");
    }
}
