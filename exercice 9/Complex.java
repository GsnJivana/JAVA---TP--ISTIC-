public class Complex {
    public double x; 
    public double y; 
    
    
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    
    public static Complex add(Complex z1, Complex z2) {
        return new Complex(z1.x + z2.x, z1.y + z2.y);
    }
    
    
    public static Complex mult(Complex z1, Complex z2) {
        double real = z1.x * z2.x - z1.y * z2.y;
        double imag = z1.x * z2.y + z1.y * z2.x;
        return new Complex(real, imag);
    }
    
    
    public static String toString(Complex z) {
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
    
    
    public static void main(String[] args) {
        
        Complex un = new Complex(1, 0);
        
        
        double x = 2.5; 
        double y = 3.0; 
        Complex z = new Complex(x, y);
        
        Complex zPlus1 = add(z, un);
        Complex zMoins1 = add(z, new Complex(-1, 0));
        Complex zFois1 = mult(z, un);
        Complex zFoisI = mult(z, new Complex(0, 1));
        Complex zCarre = mult(z, z);
        
        System.out.println("z = " + toString(z));
        System.out.println("z + 1 = " + toString(zPlus1));
        System.out.println("z - 1 = " + toString(zMoins1));
        System.out.println("z * 1 = " + toString(zFois1));
        System.out.println("z * i = " + toString(zFoisI));
        System.out.println("z² = " + toString(zCarre));
    }
}