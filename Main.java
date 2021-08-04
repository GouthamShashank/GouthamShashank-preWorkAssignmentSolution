package com.gou;
import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	public void checkPalindrome(int x)  {
		int r,sum=0,temp;    
		  int n=x;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");
    }
          //function to printPattern
     public void printPattern(int x) {
         int rows = x;
         System.out.println("## Printing the pattern ##");
         
         for (int i=1; i<=rows; i++) 
         { 
             // Print star in decreasing order 
             for (int k=rows; k>=i; k--)
             {
                 System.out.print("*");
             }
           
              System.out.println();
         }
         
     }
      //function to check no is prime or not
      public void checkPrimeNumber(int x) {
    	  int num, i, count=0;
          num = x;
  		
          for(i=2; i<num; i++)
          {
              if(num%i == 0)
              {
                  count++;
                  break;
              }
          }
          if(count == 0)
          {
              System.out.print("This is a Prime Number");
          }
          else
          {
              System.out.print("This is not a Prime Number");
          }
      }
        // function to print Fibonacci Series
        public void printFibonacciSeries(int x) {
        	int n1=0,n2=1,n3,i,count=x;    
        	 System.out.print(n1+" "+n2);//printing 0 and 1    
        	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        	 {    
        	  n3=n1+n2;    
        	  System.out.print(" "+n3);    
        	  n1=n2;    
        	  n2=n3;    
        	 }
        }
	public static void main(String[] args) {
		 Main obj = new Main();
         int choice,x;
         Scanner sc = new Scanner(System.in);
         do {
        	 System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
        	 + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
        	 + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        	 System.out.println();

        	 choice = sc.nextInt();
        	 x = sc.nextInt();

        	 switch (choice) {
        	 case 0:
        	 choice = 0;
        	 break;
        	 case 1: {
        		 obj.checkPalindrome(x);
        	 }
        	 break;
        	 case 2: {
        		 obj.printPattern(x);
        	 }
        	 break;
        	 case 3: {
        		 obj.checkPrimeNumber(x);
        	 }
        	 break;
        	 case 4: {
        		 obj.printFibonacciSeries(x);
        	 }
        	 break;
        	  
        	 default:
        		 System.out.println("Invalid choice. Enter a valid no.\n");
        	 }
        	 } while (choice != 0);
	        	 System.out.println("Exited Successfully!!!");
	        	 sc.close();
        	 }
	
	}
  