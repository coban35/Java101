import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen sicaklik giriniz");
        sicaklik=input.nextFloat();
        if(sicaklik<5)
        {
            System.out.println("Kayak Yapabilirsin");
        }
        if (sicaklik>=5 && sicaklik<=15)
        {
            System.out.println("Sinemaya Gidebbilirsin");
        }
        if (sicaklik>=10 && sicaklik<=25)
        {
            System.out.println("Piknik Yapabilirsin");

        }
        else if(sicaklik>=25)
        {
            System.out.println("Yüzmeye Gidebilirsin");
        }
    }
}
