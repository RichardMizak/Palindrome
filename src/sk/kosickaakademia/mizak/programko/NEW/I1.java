package Polymorfizmus;

public interface I1 {
    public void animal();

    default public void wildAnimal(){
        System.out.println("horse");
    }

}
