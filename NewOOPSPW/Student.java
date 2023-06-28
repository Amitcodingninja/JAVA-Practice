package NewOOPSPW;

import java.sql.Struct;

public class Student {
    String name;
    int rno;
    double percent;
    final String SchoolName=" P.L. Shiksha Niketan";
  static   int  noOfStudent ;

    // public int getRno()
    // {
    // return rno;
    // }
    // public void setRoll(int roll)
    // {
    // this.rno=roll;
    // }

    // Ab Hm Constructor bnayege jo ki 1 line main kam krega
    // `Student()` is a constructor for the `Student` class. It is an empty
    // constructor with no
    // parameters and no code inside the body.
    public Student(String naam, int roll, double per) {
        name = naam;
        rno = roll;
        percent = per;
        noOfStudent ++;

    }
}
