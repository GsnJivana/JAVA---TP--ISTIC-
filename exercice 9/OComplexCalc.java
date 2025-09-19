
public class OComplexCalc {
    public static void main(String[] args) {
        
        OComplex un = new OComplex(1, 0);
        OComplex i = new OComplex(0, 1);
        
        
        double x = 2.5;
        double y = 3.0;
        
        OComplex z = new OComplex(x, y);
        
        
        System.out.println("VERSION STATIQUE");
        OComplex zPlus1 = OComplex.add(z, un);
        OComplex zMoins1 = OComplex.add(z, new OComplex(-1, 0));
        OComplex zFois1 = OComplex.mult(z, un);
        OComplex zFoisI = OComplex.mult(z, i);
        OComplex zCarre = OComplex.mult(z, z);
        
        System.out.println("z = " + OComplex.toString(z));
        System.out.println("z + 1 = " + OComplex.toString(zPlus1));
        System.out.println("z - 1 = " + OComplex.toString(zMoins1));
        System.out.println("z * 1 = " + OComplex.toString(zFois1));
        System.out.println("z * i = " + OComplex.toString(zFoisI));
        System.out.println("z² = " + OComplex.toString(zCarre));
        
        
        System.out.println("\nVERSION MÉTHODE D'OBJET");
        OComplex zPlus1_obj = z.add(un);
        OComplex zMoins1_obj = z.add(new OComplex(-1, 0));
        OComplex zFois1_obj = z.mult(un);
        OComplex zFoisI_obj = z.mult(i);
        OComplex zCarre_obj = z.mult(z);
        
        System.out.println("z = " + z.toString());
        System.out.println("z + 1 = " + zPlus1_obj.toString());
        System.out.println("z - 1 = " + zMoins1_obj.toString());
        System.out.println("z * 1 = " + zFois1_obj.toString());
        System.out.println("z * i = " + zFoisI_obj.toString());
        System.out.println("z² = " + zCarre_obj.toString());
    }
}