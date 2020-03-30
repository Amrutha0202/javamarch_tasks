package saiP_114351;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int s1 = sc.nextInt();
String[] s2= new String[s1];
for (int i=0;i<s1;i++) {
s2[i] =sc.next();
}
System.out.println(getSum(s2));
}
   
public static int getSum(String[] s1) {
int sum=0;
for (int i=0; i<s1.length;i++)
for (int j=0; j<s1[i].length();j++) {
char c = s1[i].charAt(j);
if (Character.isDigit(c)) {
if(c%2!=0) {
String t = String.valueOf(c);
int n = Integer.parseInt(t);
sum = sum + n;
}
}
}
return sum;
}
}
