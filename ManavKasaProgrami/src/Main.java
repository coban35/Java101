import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double armutKg, elmaKg,domatesKg,patlicanKg,muzKg,toplam;
        System.out.print("Lütfen Armut Kg giriniz :");
        armutKg=input.nextDouble();
        double armut=2.14;

        System.out.print("Lütfen Elma Kg giriniz :");
        elmaKg=input.nextDouble();
        double elma=3.67;

        System.out.print("Lütfen Domates Kg giriniz :");
        domatesKg=input.nextDouble();
        double domates=1.11;

        System.out.print("Lütfen Patlıcan Kg giriniz :");
        patlicanKg=input.nextDouble();
        double patlican=5.00;

        System.out.print("Lütfen Muz Kg giriniz :");
        muzKg=input.nextDouble();
        double muz=0.95;

        toplam=(armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(patlican*patlicanKg)+(muz*muzKg);
        System.out.println("Toplam ucretiniz : "+toplam);


    }
}
