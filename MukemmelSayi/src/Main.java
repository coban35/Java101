import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0,n;
        System.out.print("n sayisini giriniz :");
        n=input.nextInt();
        for (int i=1; i<n; i++)
        {
            if (n%i==0)
            {
                toplam+=i;

            }
        }
        if (n==toplam)
        {
            System.out.println(n+" Mükemmel sayidir");
        }
        else
        {
            System.out.println(n+" Mükemmel sayi degildir");
        }
    }
}
