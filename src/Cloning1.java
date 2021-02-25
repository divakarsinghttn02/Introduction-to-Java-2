class student implements Cloneable
{
     int roll_no;
    String name;
    public student(int roll_no,String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class Cloning1 {
    public static void main(String[] args){
        try
        {
            student s=new student(1,"Divakar");
            student s1=(student) s.clone();
            System.out.println("Details of object 1 is : Roll no : "+s.roll_no+" Name : "+s.name);
            System.out.println("Details of object 1 is : Roll no : "+s1.roll_no+" Name : "+s1.name);

        }

      catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
