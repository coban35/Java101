import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double topUcret=0,ucret=0.10;
        int yas,yolTip,km;
        Scanner input=new Scanner(System.in);
        System.out.print("Km :");
        km=input.nextInt();
        System.out.print("Yas :");
        yas=input.nextInt();
        System.out.print("Yolculuk Tipi :");
        yolTip=input.nextInt();
        if ((km>0 && yas>0) && (yolTip==1 || yolTip==2))
        {

            topUcret=ucret*km;

            if (yas<12) {
                topUcret=topUcret-(topUcret*0.50);
            }
            else  if (yas>12 && yas<24) {
                topUcret=topUcret-(topUcret*0.10);
            }
            else  if  (yas>65)
            {
                topUcret=topUcret-(topUcret*0.30);

            }
            if (yolTip==2)
            {
                topUcret=topUcret-(topUcret*0.20);
            }
            else {
                System.out.println("Dönüş Bileti Almadıgınız için %20 indirim uygulanmadı");
            }
        }
        else
        {
            System.out.println("Hatalı Veri Girdiniz");
        }
        System.out.println("Toplam ucretiniz :"+topUcret);


    }
}