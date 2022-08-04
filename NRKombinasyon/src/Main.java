import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,n,nFakt=1,rFakt=1,nrFakt=1,sonuc;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Faktoriyeli 1.Alınacak Sayıyı  Giriniz :");
        n=input.nextInt();
        System.out.print("Lütfen Faktoriyeli 2.Alınacak Sayıyı  Giriniz :");
        r= input.nextInt();
        for (int i=1; i<=n; i++)
        {
            nFakt*=i;
        }
        for (int k=1; k<=r; k++)
        {
            rFakt *= k;
        }
        for (int e=1; e<=(n-r); e++)
        {
            nrFakt*=e;
        }
        sonuc=nFakt/(rFakt*nrFakt);
        System.out.println("Sonuc :"+sonuc);
    }
}
