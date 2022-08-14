import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sayac,sayi,maxSayi=0,minSayi=0;
        System.out.println("Lütfen Limit Degerini Giriniz");
        sayac=input.nextInt();
        for (int i=1; i<=sayac; i++)
        {
            System.out.println(i+".Sayiyi giriniz");
            sayi=input.nextInt();
            if (i==1)
            {
                maxSayi=sayi;
                minSayi=sayi;
            }
            if (minSayi>sayi)
            {
                minSayi=sayi;
            }
            if (maxSayi<sayi)
            {
                maxSayi=sayi;
            }
        }
        System.out.println("Min Değeriniz:"+minSayi);
        System.out.println("Max Değeriniz:"+maxSayi);


    }
}
