import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word :");
        String str=sc.next();
        while(!str.equals("Done"))
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
        }


    }
}
