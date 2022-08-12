public class Main {
    public static void main(String[] args) {
        int counter=1,space=4,counter2=9,space2=1;
        for (int i=0; i<5; i++)
        {
            for (int k=0; k<space; k++)
            {
                System.out.print(" ");

            }
            for (int e=0; e<counter; e++)
            {
                System.out.print("*");
            }
            counter+=2;
            space--;
            System.out.println(" ");
        }
        for (int b=0; b<5; b++)
        {
            for (int c=0; c<space2; c++)
            {
                System.out.print(" ");

            }
            for (int d=0; d<(counter2-2); d++)
            {
                System.out.print("*");
            }
            counter2-=2;
            space2++;
            System.out.println(" ");
        }
    }
}
