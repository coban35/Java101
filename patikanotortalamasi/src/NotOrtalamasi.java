import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notu :");
        mat =input.nextInt();

        System.out.print("Fizik Notu :");
        fizik=input.nextInt();

        System.out.print("Kimya Notu :");
        kimya=input.nextInt();

        System.out.print("Türkçe Notu : ");
        turkce=input.nextInt();

        System.out.print("Tarih Notu :");
        tarih=input.nextInt();

        System.out.print(" Müzik notu :");
        muzik=input.nextInt();

        int top=(mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = top/6.0;
        String durum = sonuc>=60 ? "Sınıfı Geçti" :"Sınıfta Kaldı";


       System.out.println("Ortalamaniz ="+sonuc);
       System.out.println(durum);


    }
}
