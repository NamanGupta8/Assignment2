import java.util.*;
class verifyLeapYear{
static int verify(int n){
if(n%4==0 && n%100!=0)
return 1;

else if(n%400==0)
return 1;

else
return 0;

}
static void display(int x){
if(x==1)
System.out.println("Leap Year");

else
System.out.println("Not a Leap Year");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=verify(n);
display(x);
  }
}
