public class ApartmentTest {
    
    public static void main(String[] args) {
        
        Apartment apt1 = new Apartment("123 Rue de la Paix", 3, 75, 2);
        Apartment apt2 = new Apartment("456 Avenue des Champs", 1, 45, 1);
        Apartment apt3 = new Apartment("789 Boulevard Saint-Michel", 5, 120, 4);
        Apartment apt4 = new Apartment("101 Rue de Rivoli", 2, 60, 3);
        
        
        Apartment[] parcImmobilier = {apt1, apt2, apt3, apt4};
        

        System.out.println("PARC IMMOBILIER");
        afficherParc(parcImmobilier);
        
       
        System.out.println("Total locataires: " + totalLocataires(parcImmobilier));
        
        System.out.println("\nAPPARTEMENT LE PLUS GRAND");
        Apartment plusGrand = appSurfaceMax(parcImmobilier);
        System.out.println(plusGrand);
        
        System.out.println("Surface moyenne: " + surfaceMoyenne(parcImmobilier) + " m²");
    }
    
   
    public static void afficherParc(Apartment[] parc) {
        for (int i = 0; i < parc.length; i++) {
            System.out.println((i + 1) + ". " + parc[i]);
        }
    }
    
    public static int totalLocataires(Apartment[] parc) {
        int total = 0;
        for (Apartment apt : parc) {
            total += apt.getLocataires();
        }
        return total;
    }
    
    public static Apartment appSurfaceMax(Apartment[] parc) {
        if (parc.length == 0) {
            return null;
        }
        
        Apartment maxApt = parc[0];
        for (int i = 1; i < parc.length; i++) {
            if (parc[i].getSurface() > maxApt.getSurface()) {
                maxApt = parc[i];
            }
        }
        return maxApt;
    }
    
    public static double surfaceMoyenne(Apartment[] parc) {
        if (parc.length == 0) {
            return 0.0;
        }
        
        int totalSurface = 0;
        for (Apartment apt : parc) {
            totalSurface += apt.getSurface();
        }
        
        return (double) totalSurface / parc.length;
    }
} 
    

