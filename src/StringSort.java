import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        char[] c_arr=str.toCharArray();
        char temp=0;
        for (int i = 0; i < c_arr.length; i++) {
            for (int j = 0; j <c_arr.length ; j++) {
                if(c_arr[j]>c_arr[i])
                {
                    temp=c_arr[i];
                    c_arr[i]=c_arr[j];
                    c_arr[j]=temp;
                }

            }

        }
        System.out.println("The Sorted String is :");
       for (int i = 0; i <c_arr.length ; i++) {
           System.out.print(c_arr[i]);

       }
    }
}
