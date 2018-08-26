import java.util.*;
class checkPrime{
static int isPrime(int n){
int i, c=0;

for(i=2;i<=n/2;i++){
if(n%i==0){
c=1;
break;
  }
}
if(n==1){
c=2;

}
return c;
}
static void display(int x){
if(x==1)
System.out.println("Number is not prime");

else if(x==2)
System.out.println("Number is unique");
else
System.out.println("Number is prime");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=isPrime(n);
display(x);
     }
}
