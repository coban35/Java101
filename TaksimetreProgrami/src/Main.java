import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int km;
        double ucret=10,minUcret=20,perKm=2.20,total=0;
        System.out.println("Gidilen KM giriniz :");
        Scanner input= new Scanner(System.in);
        km=input.nextInt();
        for (int i=1; i<=km; i++)
        {
            ucret+=perKm;

        }
        total=ucret<20 ? minUcret :ucret;
        System.out.printf("Ödemeniz Gereken Tutar = %.2f",total);

    }
}
