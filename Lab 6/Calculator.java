import java.util.Scanner;
public class Calculator {
    
      int num1;
      int num2;
      String operator;
     public Calculator() {
       Scanner scanCalc = new Scanner(System.in);
       System.out.print("Input the first number: ");
       int num1 = scanCalc.nextInt();
       System.out.print("The operator:");
       String operator = scanCalc.nextLine();
       System.out.print("Input the second number: ");
       int num2 = scanCalc.nextInt();
       switch(operator) {
          case "+" : 
            add(num1, num2);
	    break;
          case "-" :
            subtract(num1, num2);
            break;
          case "*" :
            multiply(num1, num2);
          case "%" : 
            divide(num1, num2);
            break;
     }
}

public void add(int num1, int num2) {
       int result = num1+num2;
       System.out.println(num1 + "+" + num2 + "=" + result);
}
public void subtract(int num1, int num2) {
      int result = num1-num2;
      System.out.println(num1 + "-" + num2 + "=" + result);
}
public void multiply(int num1, int num2) {
   int result = num1*num2;
   System.out.println(num1 + "*" + num2 + "=" + result);
}
public void divide(int num1, int num2) {
   if(num1%num2 == 0) {
   System.out.println( num1 + "/" + num2 + "=" + (num1/num2) );
   } else {
   double e = num1/(double)num2;
   System.out.println( num1 + "/" + num2 + "=" + (num1/(double)num2) );
  }
}
}
          


