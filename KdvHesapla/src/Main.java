import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenlerin Tanımlanması
        double kdvOran,kdvDahil,para;
        System.out.print("Lütfen Parayı giriniz");
        Scanner input= new Scanner(System.in);
        para=input.nextDouble();
        //- li bir değer girdirmemek için
          while(para<0)
          {
              System.out.print("Lütfen eksi li Deger Girmeyiniz");
              para=input.nextDouble();
          }
          kdvOran=para>=0 && para<=1000 ? para*(0.18) : para*(0.08);
          kdvDahil=para+kdvOran;
        System.out.println("Girmis Oldugunuz Para="+para);
        System.out.println("kdv Oranı="+kdvOran);
        System.out.println("Kdv Dahil ="+kdvDahil);

    }
}
