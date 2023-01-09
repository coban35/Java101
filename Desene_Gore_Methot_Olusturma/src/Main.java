import java.util.Scanner;
public class Main {
    static void desen(int number) {
        System.out.print(number + " ");
        if (number <= 0) {
            return;
        }
        desen(number - 5);
        System.out.print(number + " ");
    }
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number = scan.nextInt();
        scan.close();
        desen(number);
    }
}
