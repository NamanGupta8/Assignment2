import java.util.*;
class findReverse{
static int rev(int n){
int re=0,rem;
while(n!=0){
rem=n%10;
re=re*10+rem;
n/=10;
}
return re;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=rev(n);
System.out.println("Reverse of given number is "+r);
 }
}
