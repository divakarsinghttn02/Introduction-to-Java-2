class student1
{
    int roll_no;
    String name;
    public student1(int roll_no,String name)
    {
      this.roll_no=roll_no;
      this.name=name;
    }

    public student1(student1 s)
    {
     roll_no=s.roll_no;
     name=s.name;
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        student1 s1=new student1(2,"Amir");
        student1 s2=new student1(s1);
        System.out.println("S1 Object details Name is : "+s1.roll_no+" Roll no is : "+s1.name);
        System.out.println("S1 Object details Name is : "+s2.roll_no+" Roll no is : "+s2.name);
    }
}
