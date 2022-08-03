import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int toplam=0,sayi,sayac=1;
        Scanner input=new Scanner(System.in);
        do{
            System.out.print(sayac+".Sayiyi Giriniz :");
            sayi=input.nextInt();
            if (sayi%2==0 && sayi%4==0)
            {
                toplam+=sayi;
                sayac++;
            }
            else
            {
                System.out.println("Döngüden Cikiliyor...");
            }
        }while(sayi%2==0);
        System.out.println("Toplam Sonuc"+toplam);
    }
}
