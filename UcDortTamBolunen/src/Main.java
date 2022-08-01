import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayac,bolunenSayisi=0;
        double ortalama=0;
        System.out.print("Döngü kaç kere dönecek:");
        Scanner input = new Scanner(System.in);
        sayac=input.nextInt();
        for (int i=1; i<=sayac; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                bolunenSayisi += 1;
                ortalama += i;

            }
        }
        System.out.print("Sonucunuz ="+(ortalama/bolunenSayisi));

    }
}
