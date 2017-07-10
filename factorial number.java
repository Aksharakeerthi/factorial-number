# factorial-number
import java.io.*;
import java.util.*;
public class fact{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int m,fact=1;
int i;
System.out.println("Enter the number");
m=sc.nextInt();
for(i=1;i<=m;i++){
fact=fact*i;
}
System.out.println("The factorial number is:"+fact);
}
}
