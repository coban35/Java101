import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int say1,say2,say3;
        System.out.print("1. Sayi :");
        Scanner input= new Scanner(System.in);
        say1=input.nextInt();

        System.out.print("2. Sayi :");
        say2= input.nextInt();

        System.out.print("3. Sayi :");
        say3= input.nextInt();

        if (say1<say2 && say1<say3)
        {
            System.out.print(say1+"<");
            if (say2<say3)
            {
                System.out.print(say2+"<"+say3);
            }
            else
            {
                System.out.print(say3+"<"+say2);
            }
        }

        else if (say2<say1 && say2<say3)
        {
            System.out.print(say2+"<");
            if (say1<say3)
            {
                System.out.print(say1+"<"+say3);
            }
            else
            {
                System.out.print(say3+"<"+say1);
            }
        }

        else
        {
            System.out.print(say3+"<");
            if (say2<say1)
            {
                System.out.print(say2+"<"+say1);
            }
            else
            {
                System.out.print(say1+"<"+say2);
            }
        }

    }
}
