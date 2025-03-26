import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        //hello
        Student d=new Student();
        Student[] x=new Student[3];
        for(int i=0;i<3;i++)
            x[i]=d.input(cin,i+1);
        for(int i=0;i<3;i++)
            x[i].Display(x[i],i+1);
        if(!Search(x, 5))
            System.out.println("Found");
        else
            System.out.println("Not Found");


    }

    public static boolean Search(Student[] y,int i)
    {
        for(int s=0;s<y.length;s++)
        {
            if(y[s].id==i)
                return true;
        }
        return false;

    }
}