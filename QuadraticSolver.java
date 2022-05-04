import java.lang.Math;

class QuadraticSolver {
  public void quadraticMath(double a, double b, double c){
    double answer1 = (-b - Math.sqrt((b*b - (4*a*c))))/2*a;
    double answer2 = (-b + Math.sqrt((b*b - (4*a*c))))/2*a;
    System.out.println("The answers are " + answer1 + " and " + answer2);
    
  }
}
