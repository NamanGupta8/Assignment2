import java.util.*;
class checkPalindrome{
static int palin(int n){
int rev=0,rem;
while(n!=0){
rem=n%10;
rev=rev*10+rem;
n/=10;
}
return rev;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=palin(n);
if(n==x)
System.out.println("Palindrome");
else
System.out.println("Not a palindrome");
}
}
