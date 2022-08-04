import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayac;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen Sayac Değerini Giriniz :");
        sayac=input.nextInt();
        for (int i=4; i<=5; i++)
        {
            for (int k=1; k<=sayac; k*=i)
            {
                System.out.println(k);
            }
            System.out.print("\n");
        }
    }
}
