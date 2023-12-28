
public class Calisan {//superclass
    
    private String isim;
    private int maas;
    private String departman;
    
    public Calisan(String isim,int maas,String departman)
    {
        
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
        
    }
    
    public void Calis()
    {
        System.out.println("Çalışan çalışıyor...");
    }
    
    public void bilgilerigoster()
    {
        System.out.println("İsim: "+isim);
        System.out.println("Maas: "+maas);
        System.out.println("Departman: "+departman);
    }
    public void departmandegistir(String yenidepartman)
    {
        System.out.println("Departman değiştirildi...");
        departman=yenidepartman;
        System.out.println("Yeni departman: "+departman);
    }
    
    
    
}
