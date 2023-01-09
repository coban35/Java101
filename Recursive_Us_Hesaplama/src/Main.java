import java.util.Scanner;
public class Main {
    static int exponentiation(int taban,int üs ) {
        int sonuc = 1;
        if (üs <= 0) {

            return sonuc;
        } else {


            sonuc =taban*exponentiation(taban,--üs);
            return sonuc;
        }
    }
    public static void main(String[] args) {
        int result=0,üs,taban;
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Üs Degerini Giriniz");
        üs=scan.nextInt();

        System.out.println("Lütfen Taban Degerini Giriniz");
        taban=scan.nextInt();

        result=exponentiation(taban,üs);

        System.out.println("Sonuc"+result);




    }
}
