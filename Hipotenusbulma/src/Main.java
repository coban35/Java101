import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a,b,c,u,alan,cevre;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen birinci Kenarı Giriniz");
        a=input.nextInt();

        System.out.println("Lütfen İkinci Kenarı Giriniz");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs Uzunluğu"+c);

        u=(a+b+c) / 2;
        cevre=u*2;
        System.out.println("Cevrenin Uzunluğu :"+cevre);

        alan=u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alan);
        System.out.println("Alan : " + alan);





    }
}
