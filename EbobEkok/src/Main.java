import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,sayac=1,ebob=0,ekok=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 1.Sayiyi Giriniz");
        n1=input.nextInt();
        System.out.println("Lütfen 2.Sayiyi Giriniz");
        n2= input.nextInt();
        sayac=n1;
        while (sayac>=1)
        {
            if (n1%sayac==0 && n2%sayac==0)
            {
                ebob=sayac;
                break;
            }
            sayac--;
        }
        System.out.println("EBOB");
        System.out.println(ebob);
        System.out.println("==============================");
        System.out.println("EKOK");
        sayac=1;
        while (sayac<=(n1*n2))
        {
            if (sayac%n1==0 && sayac%n2==0)
            {
                ekok=sayac;
                break;
            }
            sayac++;
        }
        System.out.println(ekok);
    }
}
