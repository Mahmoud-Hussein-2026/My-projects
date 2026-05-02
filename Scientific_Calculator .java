import java.util.Scanner;

public class Main {
   static Scanner in = new Scanner (System.in);
   static double n1,n2;
    static double result=0.00;
   static String sh;
   static double sum(double n1,double n2){
            result=n1+n2;
            return result;
        }
   static double mul(double n1,double n2){
            result=n1*n2;
            return result;
        }
    static double men(double n1,double n2){
        result=n1-n2;
        return result;
        }
    static double div(double n1,double n2){
      if(n2 != 0){
        result=n1/n2;
        return result;
      }
      else{
        System.out.print("Error : Division by zero is not allowed . ");
          return 0.00;
      }
        }
      static double mx(double n1,double n2){
        result=Math.max(n1,n2);
        return result;
    }
    static double mn(double n1,double n2){
        result=Math.min(n1,n2);
        return result;
    }
  static double pow(double n1,double n2){
    // Calculates the powr of a number ( n1 raised to n2 ) .
        result=Math.pow(n1,n2);
        return result;
    }
  static double sq(double n1){
        result=Math.sqrt(n1);
        return result;
  }
  static double cb(double n1){
        result=Math.cbrt(n1);
        return result;
  }
  static double sin(double n1){
        result=Math.sin(Math.toRadians(n1));
        return result;
  }
  static double cos(double n1){
        result=Math.cos(Math.toRadians(n1));
        return result;
  }
  static double tan(double n1){
        result=Math.tan(Math.toRadians(n1));
        return result;
  }
   static double ln(double n1){
        result=Math.log(n1);
        return result;
  }
    static double mod(double n1,double n2){
        result=n1%n2;
        return result;
  }
    static int fact(int n1){
        result =1.0;
        for(int i=2;i<=n1;i++){
        result*=i;
        }
        return (int)result;
  }
    static void fun(){
              if(sh.equals("+")){
                sum(n1,n2);
          }
              else if(sh.equals("*")){
                 mul(n1,n2);
          }
              else if(sh.equals("-")){
                  
                 men(n1,n2);
          }
              else if(sh.equals("/")){
                  div(n1,n2);
          }
            else if(sh.equals("max")){
                  mx(n1,n2);
          }
               else if(sh.equals("min")){
                  mn(n1,n2);
          }
                 else if(sh.equals("pow")){
                  pow(n1,n2);
          }
                  else if(sh.equals("sq")){
                 sq(n1);
            }
                  else if(sh.equals("cb")){
                 cb(n1);
            }
            else if(sh.equals("sin")){
                 sin(n1);
            }
            else if(sh.equals("cos")){
                 cos(n1);
            }
        else if(sh.equals("tan")){
                 tan(n1);
            }
          else if(sh.equals("ln")){
                 ln(n1);
            }
        else if(sh.equals("%")){
                 mod(n1,n2);
            }
        else if(sh.equals("!")){
                 fact((int)n1);
    }
        else {
    System.out.println(" Operators List : \n" +
"- '+' : Addition\n" +
"- '-' : Subtraction\n" +
"- '*' : Multiplication\n" +
"- '/' : Division\n" +
"- '%' : Remainder (Modulus)\n" +
"- 'pow' : Power\n" +
"- 'max' : Larger of two numbers\n" +
"- 'min' : Smaller of two numbers\n" +
"- 'sq' : Square Root\n" +
"- 'cb' : Cube Root\n" +
"- '!' : Factorial\n" +
"- 'sin' : Sine\n" +
"- 'cos' : Cosine\n" +
"- 'tan' : Tangent\n" +
"- 'ln' : Natural Log");
            return;
}
    }

  /*
  * Calculator application that supports multiple operations
  * and continuous calculation until the ' = ' sign is entered .
  */
          public static void main(String[]args) {
              System.out.println(" Please enter your mathematical expression and when you finished enter '=' and enter 1 then ? then 1 if you want Operators List ");
              n1=in.nextInt();
              while(true){
                /*
                * Continuosly reads the operator and the next number ;
                * updating the current result after each operation .
                */
                  sh =in.next();
                  if(sh.equals("=")){
                      System.out.println(result);
                      break;
                  }
                  else{
                    if(sh.equals("sq")||sh.equals("cb")||sh.equals("sin")||sh.equals("cos")||sh.equals("tan")||sh.equals("ln")||sh.equals("!")){
                    fun();
                        System.out.println(" result is = "+result);
                        n1=result;
                    }
                    else{
                      n2=in.nextInt();
              fun();
                        System.out.println(" result is = "+result);
                      n1=result;
                  }
                  
              }
              }
            in.close();
}
}
