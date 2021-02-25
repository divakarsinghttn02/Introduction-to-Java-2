import java.util.Scanner;

public class Second {
    public static void convertTo(int n)
    {
        int day =n/(24*60*60);
        n=n%(24*60*60);
        int hours=n/(60*60);
        n=n%(60*60);
        int minutes=n/60;
        n%=60;
        int seconds=n;
        System.out.println("No of days : "+day+" No. of hours : "+hours+" No. of Minutes : "+minutes+" No of Seconds : "+seconds);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter seconds");
        int sec=sc.nextInt();
        convertTo(sec);
    }
}
