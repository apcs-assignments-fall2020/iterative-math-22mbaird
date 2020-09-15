import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double g = x/2;
        double bdif = Double.MAX_VALUE;
        double r = g;
        while (Math.abs(bdif) >=-1){
            double g1 = x/g;
            g = (g+g1)/2;
            bdif = ((g-r)/r);
            r = g;
        }
        return g;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int c = 1, i;
        for (i = 2; i<=x; i++){
            c *=1;
        }

        return c;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static final double dec = 1.0e-10;
    public static double calculateE() {
        long one = 1;
        double e = 2.0;
        int y = 2;
        double e1;
       
        do {
            e1 = e;
            one *= y++;
            e+= 1.0/one;
            
        } while (Math.abs(e-e1)>=dec);
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Double: ");
        Double sqrt = scan.nextDouble();
        System.out.print("Integer: ");
        int inp = scan.nextInt();
        System.out.println(babylonian(sqrt));
        System.out.println(factorial(inp));
        System.out.println(calculateE());
        scan.close();

        // YOUR CODE HERE


        

        scan.close();
    }
}
