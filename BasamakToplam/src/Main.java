import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int total=0,number;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Sayiyi Giriniz");
        number=input.nextInt();
        while(number!=0)
        {
            total+=number%10;
            number/=10;
        }
        System.out.println("Toplam Degeriniz :"+total);
    }
}
