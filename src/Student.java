import java.util.Scanner;

public class Student {
    String name;
    int id,age;
    double cgpa;
    public Student input(Scanner cin,int ind)
    {
        Student p=new Student();
        System.out.println("Enter id of a student "+ind);
        p.id=cin.nextInt();
        System.out.println("Enter age of a student "+ind);
        p.age=cin.nextInt();
        System.out.println("Enter name of a student "+ind);
        p.name=cin.next();
        System.out.println("Enter cgpa of a student "+ind);
        p.cgpa=cin.nextDouble();
        return p;

    }

    public void Display(Student x,int ind)
    {
        System.out.print("Student "+ind+"\t");
        System.out.println("ID ="+x.id+"\t"+"Age ="+x.age+"\t"+"Name ="+x.name+"\t"+"CGPA ="+x.cgpa);
    }
//    public boolean Search(Student[] y,int i)
//    {
//        for(int s=0;s<y.length;s++)
//        {
//            if(y[s].id==i)
//                return true;
//        }
//        return false;
//
//    }

}
