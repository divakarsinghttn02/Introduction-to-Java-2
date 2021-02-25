abstract class Library
{
    abstract void showDetails();
}
class Book extends Library
{
    String b_name;
    String author;

    public Book(String name,String author)
    {
        this.b_name=name;
        this.author=author;

    }
    public void showDetails()
    {
        System.out.println("Name of the Book is : "+this.b_name);
        System.out.println("Id of the Student is  : "+this.author);
    }

}
interface PrintEmployee
{
    void print();
}
class Employee implements PrintEmployee
{
    String name;
    int E_id;
    public Employee(String name,int E_id)
    {
        this.name=name;
        this.E_id=E_id;

    }
    public void print()
    {
        System.out.println("Name of the Employee is : "+this.name);
        System.out.println("Id of the Student is  : "+this.E_id);
    }
}
class Students extends Library
{
    String s_name;
    int s_id;
    public Students(String s_name,int s_id )
    {
        this.s_name=s_name;
        this.s_id=s_id;
    }
    public void showDetails()
    {
        System.out.println("Name of the Student is : "+this.s_name);
        System.out.println("Id of the Student is  : "+this.s_id);
    }

}




public class Lms {


    public static void main(String[] args) {
        Book b =new Book("Head first","Reema");
        Employee emp=new Employee("Divakar",123);
        Students s =new Students("Amir",170);
        b.showDetails();
        emp.print();
        s.showDetails();





    }


}
