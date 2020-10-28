package sk.kosickaakademia.mizak.programko.Students;

public class Credit {
    private int math;
    private int eng;
    private int pro;

    public Credit(int math, int eng, int pro) {
        this.math = math;
        this.eng = eng;
        this.pro = pro;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int getPro() {
        return pro;
    }
    @Override
    public String toString(){
        return "Grades: MAT: "+getMath()+" ENG: "+getEng()+" PRO: "+getPro();
    }
}
