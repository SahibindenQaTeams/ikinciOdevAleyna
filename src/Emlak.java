public class Emlak extends Ilan {

    public String siteicerisindeMi;
    public  int banyoSayisi;
    public int kat;
    public int alan;
    public int oda;


    public void Yazdir () {
        System.out.println("Kayıt Edilen İlanın Bilgieri : ");
        System.out.println("İlan Tipi : Emlak");
        System.out.println("İlan Başlığı : " + ilanBasligi);
        System.out.println("İlan Açıklaması : " + ilanAciklamasi);
        System.out.println("Evdeki Oda Sayisi : " + oda);
        System.out.println("Evdeki Banyo Sayisi : " + banyoSayisi);
        System.out.println("Evin m2 cinsinden alanı : " + alan);
        System.out.println("Evin kat bilgisi : " + kat + " Katli binanın " + kat + " katındadır.");
        System.out.println("Evin Site içerisinde olup olmadığı bilgisi : " + siteicerisindeMi);
        System.out.println("Evin bulunduğu şehir : " + sehir);
        System.out.println("Evin bulundugu ilçe : " + ilce);
        System.out.println("İlanın sahibinden olup olmadığı bilgisi : " + sahibindenMi);
        System.out.println("Ilan eklemeye devam etmek icin 'oluştur', cikmak icin 'çıkış' yazınız.");
    }
}
