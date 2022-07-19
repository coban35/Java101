import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,hesap;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen Boy Giriniz :");
        boy=input.nextDouble();
        System.out.println("Lütfen Kilo Giriniz");
        kilo=input.nextDouble();
        hesap=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz :"+hesap);

    }
}
