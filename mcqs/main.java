package mcqs;

class Complex {
    private double re, im;    
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
    Complex(Complex i) {
        
        re = i.re;
        im = i.im;
    }
}
  
public class main {
    public static void main(String[] args) {
        //Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.println(c2);
    }
}
