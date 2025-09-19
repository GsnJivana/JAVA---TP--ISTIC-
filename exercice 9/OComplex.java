public class OComplex {
    private double x; // partie réelle
    private double y; // partie imaginaire
    
    // Constructeurs
    public OComplex() {
        this(0, 0);
    }
    
    public OComplex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Accesseurs
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    // VERSION STATIQUE
    public static OComplex add(OComplex z1, OComplex z2) {
        return new OComplex(z1.x + z2.x, z1.y + z2.y);
    }
    
    public static OComplex mult(OComplex z1, OComplex z2) {
        double real = z1.x * z2.x - z1.y * z2.y;
        double imag = z1.x * z2.y + z1.y * z2.x;
        return new OComplex(real, imag);
    }
    
    public static String toString(OComplex z) {
        if (z.y == 0) {
            return String.valueOf(z.x);
        } else if (z.x == 0) {
            if (z.y == 1) {
                return "i";
            } else if (z.y == -1) {
                return "-i";
            } else {
                return z.y + "i";
            }
        } else {
            if (z.y == 1) {
                return z.x + " + i";
            } else if (z.y == -1) {
                return z.x + " - i";
            } else if (z.y > 0) {
                return z.x + " + " + z.y + "i";
            } else {
                return z.x + " - " + Math.abs(z.y) + "i";
            }
        }
    }
    
    // VERSION MÉTHODE D'OBJET
    public OComplex add(OComplex z) {
        return new OComplex(this.x + z.x, this.y + z.y);
    }
    
    public OComplex mult(OComplex z) {
        double real = this.x * z.x - this.y * z.y;
        double imag = this.x * z.y + this.y * z.x;
        return new OComplex(real, imag);
    }
    
    @Override
    public String toString() {
        return OComplex.toString(this);
    }
}

