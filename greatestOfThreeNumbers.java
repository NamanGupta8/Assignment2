import java.util.*;
class greatestOfThreeNumbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d;
d=(a>b && a>c)?a:(b>c?b:c);
System.out.println("Greatest of given three numbers is "+d);


}
}
