2import java.util.Scanner;
public  class Calculator{
    public static void main (String[]  args){
Scanner input = new Scanner(System.in);
System.out.printIn(x:"MY CALCULATOR");
int a;
int b;
System.out.printIn(x:"enter value for a");
a= input.nextInt();        
System.out.printIn(x:"enter value for b");
b= input.nextInt(); 
int sum = a + b ;
int div = a/b;
int sub = a - b;
int multi = a*b ;
System.out.printIn(x:"your answer are");
System.out.printIn(sum);
System.out.printIn(div);
System.out.printIn(sub);
System.out.printIn(multi);
    }
}