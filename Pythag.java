package pythag;

import java.util.Scanner;

public class Pythag {

  public static void main(String[] args) {
    double a, b, c, hypotenuse;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the first side of your right triangle");
    a = input.nextInt();
    System.out.println("Please enter the second side of your right triangle");
    b = input.nextInt();
    
    c = a * a + b * b;
    hypotenuse = Math.sqrt(c);
    
    System.out.printf("Longest side or hypotenuse = %.2f\n", hypotneuse);
    
    System.out.printf("Hypotenuse using Math.hypot() = %.2f\n", Math.hypot(a, b));

    //how could you rewrite the statement so it uses the Math class function pow() ?
    //c = a*a + b*b
    //c = pow(a, 2) + pow(b, 2)

  }
}
