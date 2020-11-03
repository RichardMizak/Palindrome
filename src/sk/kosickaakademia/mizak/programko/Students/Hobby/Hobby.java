package sk.kosickaakademia.mizak.programko.Students.Hobby;

public abstract class Hobby {
    private int year;
    public String name;

    public Hobby(String name) {
        this.name=name;
    }
    public Hobby(String name, int year){
        this.year=year;
    }
}
