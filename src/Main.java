import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ilanTipi;


        while (true) {
            System.out.println("Lutfen eklemek istediginiz ilanin tipini giriniz : ");
            ilanTipi = sc.nextLine();
            Emlak emlak = new Emlak();
            Vasita vasita = new Vasita();

            if (Objects.equals(ilanTipi, "emlak")) {
                System.out.println("Lutfen ilanınız için bir başlık giriniz : ");
                emlak.ilanBasligi = sc.nextLine();
                System.out.println("Lutfen ilanınız için bir açıklama giriniz : ");
                emlak.ilanAciklamasi = sc.nextLine();
                System.out.println("Lutfen oda sayisini giriniz : ");
                emlak.oda = sc.nextInt();
                System.out.println("Lutfen evin banyo sayisini giriniz : ");
                emlak.banyoSayisi = sc.nextInt();
                System.out.println("Lutfen evin alanını m2 cinsinden giriniz : ");
                emlak.alan = sc.nextInt();
                System.out.println("Lutfen evin kaçıncı katta olduğunu giriniz : ");
                emlak.kat = sc.nextInt();
                sc.nextLine();
                System.out.println("Lutfen evin site içerisinde olup olmadığını belirtiniz : ");
                emlak.siteicerisindeMi = sc.nextLine();
                System.out.println("Lutfen evin bulunduğu şehiri belirtiniz : ");
                emlak.sehir = sc.nextLine();
                System.out.println("Lutfen evin bulunduğu ilçeyi yazınız : ");
                emlak.ilce = sc.nextLine();
                System.out.println("Lutfen ilanın sahibinden mi olup olmadığını belirtiniz : ");
                emlak.sahibindenMi = sc.nextLine();
                emlak.Yazdir();
            } else if (Objects.equals(ilanTipi, "vasıta")) {
                System.out.println("Lutfen ilanınız için bir başlık giriniz : ");
                vasita.ilanBasligi = sc.nextLine();
                System.out.println("Lutfen ilanınız için bir açıklama giriniz : ");
                vasita.ilanAciklamasi = sc.nextLine();
                System.out.println("Lutfen aracın bulunduğu şehiri belirtiniz : ");
                vasita.sehir = sc.nextLine();
                System.out.println("Lutfen aracın bulunduğu ilçeyi yazınız : ");
                vasita.ilce = sc.nextLine();
                System.out.println("Lütfen aracın şanzıman türünü belirtiniz : ");
                vasita.vitesTipi = sc.nextLine();
                System.out.println("Lütfen aracın rengini belirtiniz : ");
                vasita.renk = sc.nextLine();
                System.out.println("Lütfen aracın kazalı olup olmadığını belirtin : ");
                vasita.kazaliMi  = sc.nextLine();
                System.out.println("Lutfen ilanın sahibinden mi olup olmadığını belirtiniz : ");
                vasita.sahibindenMi = sc.nextLine();
                vasita.Yazdir();
            } else {
                System.out.println("Geçerli olmayan bir ilan tipi girdiniz.(emlak/vasıta giriniz).");
                break;
            }


        }
    }
}