class sqrtN{
  
  public void sqrtOfN(double n){
    double loop = 1;
    while(true){
    double answer = n/loop;
    if (answer == loop){
      System.out.println("Square root of " + n + " is " + answer);
      break;
    }
    else{
      System.out.println(answer + " " + loop);
    }
      
    loop += 1;
  }
}
}


//Very bad program that crashes program if number isn't a perfect square

