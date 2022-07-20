import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName,password,newPasswd,durum;

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen kullanici adi giriniz");
        userName=input.nextLine();

        System.out.println("Lütfen sifre giriniz");
        password=input.nextLine();


        if(userName.equals("Fatih") && password.equals("java123"))
        {
            System.out.println("Giris Basarili");

        }
        else
        {
            System.out.println("Girmis oldugunuz kullanici adi veya sifre hatali");

            // Eğer şifre hatalıysa şifre sıfırlama işlemi gerçekleştiriyorum
            if (userName.equals("Fatih"))
            {

                System.out.println("Şifrenizi değiştirmek istermisiniz?");

                System.out.print("Evet || Hayır :");
                durum=input.nextLine();


                if (durum.equals("Evet"))
                {
                    System.out.print("Lütfen Şifrenizi giriniz :");
                    newPasswd=input.nextLine();
                    if (newPasswd.equals(password) || newPasswd.equals("java123"))
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                    }
                    else
                    {
                        password=newPasswd;
                        System.out.println("Şifre oluşturuldu" );
                    }

                }
                else
                {
                    System.out.println("şifre değiştirilme islemi iptal edildi");
                }
            }
        }
    }
}
