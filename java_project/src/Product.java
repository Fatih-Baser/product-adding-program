
public class Product{
 
    private String produkt;
   private String marka;
   private String waga;
   private String cena;
   private String kawałek;

   public Product(){
       
   }
    
    public String getProdukt() {
        return produkt;
    }

    
    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    
    public String getMarka() {
        return marka;
    }

  
    public void setMarka(String marka) {
        this.marka = marka;
    }

   
    public String getWaga() {
        return waga;
    }

    
    public void setWaga(String waga) {
        this.waga = waga;
    }

   
    public String getCena() {
        return cena;
    }

   
    public void setCena(String cena) {
        this.cena = cena;
    }

    
    public String getKawałek() {
        return kawałek;
    }

    
    public void setKawałek(String kawałek) {
        this.kawałek = kawałek;
    }
   
     public String toString(){
        return (" Produkt  : " + this.produkt  + " marka : " + this.marka + " Waga : " + this.waga + " cena : " + this.cena + " KawaLek :" +this.kawałek);
    }
   
    
       
     
   }
   

   