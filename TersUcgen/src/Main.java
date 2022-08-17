import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Lütfen n sayisini Giriniz");
        n=input.nextInt();
       for(int i=1; i<=n; i++)
       {
           for(int k=n; k>(n-i); k--)
           {
               System.out.print(" ");
           }
           for (int j=0; j<(2*n)-(2*i-1); j++)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }



    }
}
