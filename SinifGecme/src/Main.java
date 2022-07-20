import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int mat, fizik, turkce, kimya, muzik;
        double avarage;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik :");
        mat=input.nextInt();
        if (mat<0 || mat>100)
        {
            mat=0;

        }

        System.out.print("Turkce :");
        turkce=input.nextInt();
        if (turkce<0 || turkce>100)
        {
            turkce=0;

        }

        System.out.print("Fizik :");
        fizik=input.nextInt();
        if (fizik<0 || fizik>100)
        {
            fizik=0;

        }

        System.out.print("Kimya :");
        kimya=input.nextInt();
        if (kimya<0 || kimya>100)
        {
            kimya=0;

        }

        System.out.print("muzik :");
        muzik=input.nextInt();
        if (muzik<0 || muzik>100)
        {
            muzik=0;

        }

        avarage=(mat+turkce+fizik+kimya+muzik)/5;
        System.out.println("Ortalamaniz :"+avarage);
        if (avarage<55)
        {
            System.out.println("Kaldınız");

        }
        else {
            System.out.println("Geçtiniz");

        }




    }
}
