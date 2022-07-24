import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int gun,ay;
        System.out.println("Hangi Ayda Doğdunuz?");
        Scanner input= new Scanner(System.in);
        ay=input.nextInt();
        if (ay==1)
        {
            System.out.print("Hangi Gün Doğdunuz :");
            gun=input.nextInt();
            if (gun>=1 && gun <=21)
            {
                System.out.println("Oğlak Burcusunuz");
            }
            else if(gun>21 && gun<=31)
            {
                System.out.println("Kova Burcusunuz");
            }

        }
        else if (ay==2)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=19)
            {
                System.out.println("Kova Burucusunuz");
            }
            else if (gun>19 && gun<=28)
            {
                System.out.println("Balık Burucusunuz");
            }

        }
        else if (ay==3)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=20)
            {
                System.out.println("Balık Burucusunuz");
            }
            else if (gun>21 && gun<=31)
            {
                System.out.println("Koç Burucusunuz");
            }

        }
        else if (ay==4)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=20)
            {
                System.out.println("Koç Burucusunuz");
            }
            else if (gun>21 && gun<=30)
            {
                System.out.println("Kova Burcusunuz");
            }

        }
        else if (ay==5)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=21)
            {
                System.out.println("Boğa Burucusunuz");
            }
            else if (gun>21 && gun<=31)
            {
                System.out.println("İkizler Burucusunuz");
            }

        }
        else if (ay==6)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=22)
            {
                System.out.println("İkizler Burucusunuz");
            }
            else if (gun>22 && gun<=30)
            {
                System.out.println("Yengeç Burucusunuz");
            }

        }
        else if (ay==7)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=22)
            {
                System.out.println("Yengeç Burucusunuz");
            }
            else if (gun>22 && gun<=31)
            {
                System.out.println("Aslan Burucusunuz");
            }

        }
        else if (ay==8)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=22)
            {
                System.out.println("Aslan Burucusunuz");
            }
            else if (gun>22 && gun<=31)
            {
                System.out.println("Başak Burucusunuz");
            }

        }
        else if (ay==9)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=22)
            {
                System.out.println("Başak Burucusunuz");
            }
            else if (gun>22 && gun<=30)
            {
                System.out.println("Terazi Burucusunuz");
            }

        }
        else if (ay==10)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=22)
            {
                System.out.println("Terazi Burucusunuz");
            }
            else if (gun>22 && gun<=31)
            {
                System.out.println("Akrep Burucusunuz");
            }

        }
        else if (ay==11)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=21)
            {
                System.out.println("Akrep Burucusunuz");
            }
            else if (gun>22 && gun<=30)
            {
                System.out.println("Yay Burucusunuz");
            }

        }
        else if (ay==12)
        {
            System.out.print("Hangi Gün Doğdunuz");
            gun=input.nextInt();
            if (gun>=1 && gun<=21)
            {
                System.out.println("Yay Burucusunuz");
            }
            else if (gun>22 && gun<=31)
            {
                System.out.println("Oğlak Burucusunuz");
            }

        }



    }
}
