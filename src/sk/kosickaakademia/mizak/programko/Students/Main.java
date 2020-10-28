package sk.kosickaakademia.mizak.programko.Students;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Credit gradesS1 = new Credit(4, 5, 6);
        LocalDate datum;
        Student s1 = new Student("Rišo", "Mižak", gradesS1, classType.N1);
        Student s2 = new Student("Peťo", "Feri", null, classType.N2);
        datum = LocalDate.of(2000, Month.MARCH, 9);
        s1.setDob(datum);
        s2.setDob(datum);
    }
}
