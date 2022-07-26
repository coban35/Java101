import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int artikYil;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Yıl Giriniz :");
        artikYil= input.nextInt();
        if (artikYil%100==0 || artikYil%4==0)
        {
            if (artikYil%400==0)
            {
                System.out.println(artikYil+": Bir Artik Yildir");
            }
          else  if (artikYil%4==0 && (artikYil%100)!=0)
            {
                System.out.println(artikYil+": Bir Artik Yildir");
            }
            else
            {
                System.out.println(artikYil+": Bir Artik Yil Degildir");
            }
        }
        else {
            System.out.println("Girdigin Sayi Artik Yil Degildir");
        }
    }
}
