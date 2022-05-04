class FizzBuzz {
  double loop;
  double number;
  public void fizzBuzzMath(double number, double loop){
  
    for(this.loop = loop; number < loop; number++){
    double testThree = number % 3;
    double testFive = number % 5;
    if(testThree == 0 && testFive == 0){
      System.out.println(number + " is fizz buzz");
    }
    if(testFive == 0){
      System.out.println(number + " is buzz");
    }
    if(testThree == 0){
      System.out.println(number+ " is fizz");
    }
    else{
      System.out.println(number + " is nothing");
    };

  }
}
}
