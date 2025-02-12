package ObjectOrientedJAVA;

public class fraction {
    public static class Fraction {
        int num;
        int den;

        //constructor
        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }

        public static int gcf(int num, int den) {
            int min = Math.min(num, den);
            for (int i = min; i >= 1; i--) {
                if (num % i == 0 && den % i == 0) {
                    return i;
                }
            }
            return 1; // Return a default value if no common factor is found
        }

        public void simplify() {
            int hcf = gcf(num, den);
            num = num / hcf;
            den = den / hcf;
            System.out.println("Simplified fraction is " + num + "/" + den);
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(21, 7);
        f1.simplify();
    }
}
