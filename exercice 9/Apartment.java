public class Apartment {
    private String adresse;
    private int etage;
    private int surface;
    private int locataires;
    
   
    public Apartment() {
        this.adresse = "";
        this.etage = 0;
        this.surface = 0;
        this.locataires = 0;
    }
    

    public Apartment(String adresse, int etage, int surface, int locataires) {
        this.adresse = adresse;
        this.etage = etage;
        this.surface = surface;
        this.locataires = locataires;
    }
    

    public String getAdresse() {
        return adresse;
    }
    
    public int getEtage() {
        return etage;
    }
    
    public int getSurface() {
        return surface;
    }
    
    public int getLocataires() {
        return locataires;
    }
    
    @Override
    public String toString() {
        return "Appartement situé au " + etage + "ème étage, " + 
               adresse + ", d'une surface de " + surface + 
               " m², occupé par " + locataires + " locataire(s)";
    }
}