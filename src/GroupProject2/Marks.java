package GroupProject2;

public abstract class Marks {
    double english;
    double math;
    double science;

    Marks(double english, double math, double science) {
        this.english = english;
        this.math = math;
        this.science = science;
    }

    abstract double getPercentage();
}

class A extends Marks {

    A (double english, double math, double science) {
        super(english, math, science);
    }
    @Override
    double getPercentage() {
        double average = (english+math+science)/3;
        return average;
    }
}

class B extends Marks{
    double coding;
    B(double english, double math, double science, double coding){
        super(english, math, science);
        this.coding=coding;
    }
    @Override
    double getPercentage() {
            double average = (english+math+science+coding)/4;
        return average;
    }
}

class Main {

    public static void main(String[] args) {
        A a = new A(100, 90, 80);
        System.out.println("Student A average percenteage is "+(a.getPercentage())+"%");
        B b = new B(100, 88,92,100);
        System.out.println("Student B average percenteage is "+(b.getPercentage())+"%");

    }
}

   /*
    We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */