public class Vasita  extends Ilan{

    public String kazaliMi;
    public String renk;
    public String vitesTipi;

    public void Yazdir () {
        System.out.println("Kayıt Edilen İlanın Bilgieri : ");
        System.out.println("İlan Tipi : Vasıta");
        System.out.println("İlan Başlığı : " + ilanBasligi);
        System.out.println("İlan Açıklaması : " + ilanAciklamasi);
        System.out.println("Aracın bulunduğu şehir : " + sehir);
        System.out.println("Aracın bulundugu ilçe : " + ilce);
        System.out.println("Aracın şanzıman türü : " + vitesTipi);
        System.out.println("Aracın rengi : " + renk);
        System.out.println("Aracın kaza durumu : " + kazaliMi);
        System.out.println("İlanın sahibinden olup olmadığı bilgisi : " + sahibindenMi);
        System.out.println("Ilan eklemeye devam etmek icin 'oluştur', cikmak icin 'çıkış' yazınız.");
    }

}
