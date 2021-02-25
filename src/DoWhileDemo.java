
import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the word :");
            String str=sc.next();
           do
            {
                if(str.charAt(0)==str.charAt(str.length()-1))
                {
                    System.out.println("First and last charcters are same");


                }
                else
                {
                    System.out.println("First and last are not same");
                }
                str=sc.next();
            } while(!str.equals("Done"));


        }


}
