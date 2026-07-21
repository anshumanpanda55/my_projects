import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks in maths");
        float sc1=sc.nextFloat();
        System.out.println("enter your marks in physics");
        float sc2=sc.nextFloat();
        System.out.println("enter your marks in chemistry");
        float sc3=sc.nextFloat();
        System.out.println("enter your mark in english");
        float sc4=sc.nextFloat();
        System.out.println("enter your marks in hindi");
        float sc5=sc.nextFloat();
System.out.println("your total marks is ");
float total=sc1+sc2+sc3+sc4+sc5;
System.out.println(total);
System.out.println("your percentage is");
float percentage=total/500*100;
System.out.println(percentage);}}

