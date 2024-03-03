package SumNUmbers;
import java.util.Scanner;

public class SumNumbers {

    
    public static void main(String[] args) {
        int sum=0;
         Scanner add=new Scanner(System.in);
        System.out.println("enter the number 1 ");
        int f= add.nextInt();
        System.out.println("enter the number 2");
        int j= add.nextInt();
         int p=1;
         
        for(int i=1;i<j;i++){
           sum=sum+i;
            }  
 
       System.out.println("the sum of the number : "+sum);  
       
  
 
    
}}