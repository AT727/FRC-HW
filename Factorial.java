import java.lang.Math;

class Factorial {
int answer;
  public void findFactorial(int n){
    int loop = n-1;
    
    for(int i = 0; i < loop; loop--){
      this.answer = n *= loop;
    }
    System.out.println(answer);
    
  }
}
