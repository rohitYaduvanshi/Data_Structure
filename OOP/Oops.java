public class Oops {

    public static void main(String[] args) {
        Pen p1 = new Pen();//Constructor
        p1.setcolor("Red");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);

        Student s = new Student();
        s.calPercentage(55,66, 67);
        System.out.println(s.percentage);
    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;


    void calPercentage(int Phy, int math, int chem){
        percentage = (Phy+math+chem) /3;
    }
}