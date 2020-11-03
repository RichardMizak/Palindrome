package sk.kosickaakademia.mizak.programko.Students;

import sk.kosickaakademia.mizak.programko.Students.Hobby.Hobby;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Main extends Hobby {
    private ArrayList<Student> studenti = new ArrayList<Student>();

    public Main(String name) {
        super(name);
    }

    public Main(String name, int year) {
        super(name, year);
    }

    public static void main(String[] args) {
     /*   Student[] students;
        students=initStudents();
      //printN1Students(students);
        printGoodStudents(students);*/



    }



    private static void printGoodStudents(Student[] students) {
        int len= students.length;
        for (int i=0;i<len;i++){
            Credit temp=students[i].getGrades();
            double avg=(( temp.getEng()+ temp.getMath()+ temp.getPro())/3.0);
            if (avg<=2)
               /* for (int j = 0; j < len-1; j++)
                    for (int k = 0; k < len-k-1; k++)
                        if (avg[j] > avg[j+1])
                        {
                            temp = avg[j];
                            avg[j] = avg[j+1];
                            avg[j+1] = temp;
                        }*/
                System.out.println(" "+students[i].getFirstName()+" "+students[i].getLastName()+" "+avg);

        }

    }
    private static void printN1Students(Student[] students) {

        int len= students.length;
        for (int i=0;i<len;i++){
            if(students[i].getClassType()==classType.N1)
                System.out.println(" "+students[i].getFirstName()+" "+students[i].getLastName());
        }
        System.out.println();
    }

    private static Student[] initStudents() {
        Student[] s=new Student[10];

        Credit gradesS1 = new Credit(4, 5, 2);
        Student s1 = new Student("Rišo", "Mižak", gradesS1, classType.N1,);
        s[0]=s1;

        Student s2 = new Student("Milan", "Petrik",new Credit(1,2,3), classType.N3);
        s[1]=s2;
/*
        String[] fnames=new String[]{"Jan","Peter","Michal","Pavol","Ivan",};
        String[] lnames=new String[]{"Hatala","Gazi","Petruska","Sivak","Novak",};
        classType[] classNames=new classType[]{classType.N1,classType.N2,classType.N3};

        for (int i=0;i<5;i++){
            s[i+2]= new Student(fnames[i],lnames[i],null,classNames[i]);
        }*/
        Student s3 = new Student("Jan", "Hatala",new Credit(5,2,3), classType.N1);
        s[2]=s3;

        Student s4 = new Student("Peter", "Gazi",new Credit(1,4,3), classType.N2);
        s[3]=s4;

        Student s5 = new Student("Michal", "Petruska",new Credit(1,1,1), classType.N1);
        s[4]=s5;

        Student s6 = new Student("Pavol", "Sivak",new Credit(1,2,5), classType.N1);
        s[5]=s6;

        studenti.add(s3);
        return s;
    }

}
