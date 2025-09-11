public class Parallelepiped{
	static double surface(double longueur,double largeur,double hauteur){
		return 2*((longueur*largeur)+(longueur*hauteur)+(largeur*hauteur));
	}

	static double volume (double longueur,double largeur,double hauteur){
        return longueur*largeur*hauteur;
	}
	
	public static void main(String[] args){
		System.out.println("la surface du premier est  "+surface(12,3,5));
		System.out.println("le volume du 1er est  "+volume(12,3,5));
		System.out.println("la surface du deuxieme est  "+surface(4,34,10));
		System.out.println("le volume du deuxieme est  "+volume(4,34,10));
	}
}

