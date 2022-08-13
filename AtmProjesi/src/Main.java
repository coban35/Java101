import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,passwd;
        boolean approval;
        int sayac=3,balance=3000,price,select;
        Scanner input=new Scanner(System.in);
        while(sayac>0)
        {
            System.out.print("Lütfen Kullanıcı Adını Giriniz :");
            userName=input.nextLine();
            System.out.print("Lütfen Şifreyi Giriniz :");
            passwd=input.nextLine();
            if (userName.equals("Fatih") && passwd.equals("123"))
            {
                System.out.println("Patika Bankasına Hoşgeldiniz");

                do {
                    System.out.println("Lütfen Yapmak İstediğniz İşlemi Seçin");
                    System.out.print("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
                    select=input.nextInt();
                    switch (select)
                    {
                        case 1:
                            System.out.print("Yatırılacak Para Miktarını Giriniz :");
                            price=input.nextInt();
                            System.out.print("Yapmış Olduğunuz İşlemi Onaylıyormusunuz\n"+"True/"+"False:");
                            approval=input.nextBoolean();
                            if (approval)
                            {
                                System.out.println("İşlem Tamamlandı");
                                balance+=price;
                            }
                            else
                            {
                                System.out.println("Çıkış Yapılıyor...");
                            }
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Para Miktarını Giriniz :");
                            price=input.nextInt();
                            System.out.print("Yapmış Olduğunuz İşlemi Onaylıyormusunuz\n"+"True/"+"False:");
                            approval=input.nextBoolean();
                            if (approval)
                            {
                                if (balance<price)
                                {

                                    System.out.println("Bakiye Yeterli Değil");
                                }
                                else
                                {
                                    balance-=price;
                                }

                            }
                            else {
                                System.out.println("İşlem İptal Edildi");
                            }
                            break;

                        case 3:
                            System.out.print("Yapmış Olduğunuz İşlemi Onaylıyormusunuz\n"+"True/"+"False:");
                            approval=input.nextBoolean();
                            if (approval)
                            {
                                System.out.println("Hesabınızda ki Bakiye Miktarı :"+balance);
                            }
                            else
                            {
                                System.out.println("İşlem İptal Edildi");
                            }
                            break;
                        case 4:

                                System.out.println("Çıkış İşlemi Onaylandı İyi Günler Dileriz");

                            break;
                    }
                }while(select!=4);
                break;

            }
            else
            {
                sayac--;

                if (sayac==0)
                {
                    System.out.println("Girme Hakkınız Kalmadı Hesabınız Bloke Edilmiştir");
                }
                else
                {
                    System.out.println("Hatalı Giriş Yaptınız Lütfen Tekrar Giriş Yapın");
                    System.out.println("Kullanıcı girişi yapmak için kalan hakkınız :"+sayac);
                }
            }
        }

    }
}
