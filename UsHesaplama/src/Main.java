import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int taban,us,sonuc=1;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Üs Değerini Giriniz :");
        us=input.nextInt();
        System.out.print("Lütfen Hesaplanılacak Taban Degerini Giriniz :");
        taban=input.nextInt();

        for (int i=0; i<us; i++ )
        {
            sonuc*=taban;

        }
        System.out.println("Sonucunuz :"+sonuc);
    }
}
