import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1,number2,solution,process;
        Scanner input=new Scanner(System.in);
        System.out.print("Number 1 :");
        number1=input.nextInt();
        System.out.print("Number 2 :");
        number2=input.nextInt();
        System.out.println("PROCCES\n Collection :1\tExtraction :2\tmultiplication :3\tdivide :4");
        process=input.nextInt();
        switch (process)
        {
            case 1:
                solution=number1+number2;
                System.out.println("Solution :"+solution);
                break;
            case 2:
                solution=number1-number2;
                System.out.println("Solution :"+solution);
                break;
            case 3:
                solution=number1*number2;
                System.out.println("Solution :"+solution);
                break;
            case 4:
                solution=number1/number2;
                System.out.println("Solution :"+solution);
                break;
            default:
                System.out.println("Try again");

        }



    }
}
