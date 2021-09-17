class GravityCalculator {
public static void main(String[] arguments) {
     double a = -9.81; 
     double v = 0.0;
     double t = 10.0;
     double x = 0.0;
     double xt = 0.5 * a *( t * t) + v * t + x;
     System.out.println("The object's position after " + t +
" seconds is " + xt + " m.");
   }
}