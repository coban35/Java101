import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float r,alan,a,pi=3.14f;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin Yarıcapını Giriniz ");
        r=inp.nextFloat();
        System.out.println("Açıyı giriniz");
        a= inp.nextFloat();
        alan=(pi * (r*r) * a) / 360;
        System.out.printf("Alan : %.2f",alan);

    }
}
