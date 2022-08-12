import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        double toplam=0.0;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen Sayiyi Giriniz :");
        n=input.nextInt();
        for (int i=1; i<2; i++)
        {
            for (double k=1; k<=n; k++)
            {
                toplam+=(i/k);

            }
        }
        System.out.print(toplam);
    }
}
