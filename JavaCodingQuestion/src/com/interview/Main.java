package com.interview;

import java.util.Arrays;
import java.util.List;

public class Main {

	
	private static boolean checkOdd(List<Integer> list)
	{
		for(int i:list)
		{
	         if(i%2==0)
	         {
	        	 return false;
	         }
		}
		
		return true;
		
	}
	
	
	  private static boolean checkaPalindrome(String str)
	  {
		  
		  for(int i=0; i<str.length()/2; i++)
		  {
			  if(str.charAt(i)!=str.charAt(str.length()-i-1))
			  {
				  return false;
			
			  }
		  }
		  
		return true;
		  
	  }
	  
	  
	  private static int checkArmStrong(int number)
	  {
		  
		int orignalNumber = number;
		int countDigit = String.valueOf(number).length();
		int sum=0;
		
		while(number!=0)
		{
			int lastDigit = number % 10;
		    sum += Math.pow(lastDigit, countDigit);
		    number = number/10;
		 
		}
		  
		return sum;
		  
	  }
	  
	
	
	
	
	public static void main(String[] args) 
	{
		
		
		/*===================REVERSE A STRING=================================*/
		
		String str ="hello";
		
		char[] in = str.toCharArray();
		
		StringBuilder out = new StringBuilder();
		
		for(int i =in.length-1;i>=0;i--)
		{
			out.append(in[i]);
		}
		
		System.out.println(out.toString());
		
		
		/**=====================SWAP TWO NUMBERS==============*/
		
		int a = 10, b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // a = 30
        b = a - b; // b = 10 (original a)
        a = a - b; // a = 20 (original b)

        System.out.println("After swap: a = " + a + ", b = " + b);
        
        /**=====================CONTAINS VOWELs==============*/
        
          String input = "hll";
          boolean hasVowel = false;
          
          input = input.toLowerCase();
          
          
          for(int i =0;i<input.length();i++)
          {
        	  char ch= input.charAt(i);
        	  
        	  if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
        	  {
        		  
        		  hasVowel = true;
        		  
        		  break;
        		  
        		  
        	  }
        	  
        	  
        	  
          }
          
          if (hasVowel) {
              System.out.println("The string contains a vowel.");
          } else {
              System.out.println("The string does NOT contain any vowels.");
          }
          
          
          /**=====================CHECK PRIME NUMBER==============*/
          
             int sh =6;
             boolean isPrime = true;
             
             for(int i=2;i<=Math.sqrt(sh);i++)
             {
            	             
                 if(sh % i ==0)
                 {
                	 isPrime = false;
                	 break;
                 }
                 
                
             
             }
             
             if(isPrime)
             {
            	 System.out.println("Prime");
             }
             else
             {
            	 System.out.println("Non-Prime");
             }
             
             
             /**=====================Fibonacci Series==============*/
             
             int first =0;
             int second = 1;
             int count =20;
             
            for(int i =1;i<=count;i++)
            {
            	System.out.print(first);
            	
            	if(i<count)
            	{
            		System.out.print(",");
            	}
            	
            	int next=first+second;
            	 first=second;
            	 second = next;
            	
            	
            }
            
            
            /**=====================Integer contains only odd Number==============*/
            
           List<Integer> list = Arrays.asList(1,3,5,7);
           
           
           
           
       boolean hasOdd =    checkOdd(list);
       
       if(hasOdd)
       {
    	   System.out.println("pure Odd Number");
       }
       else
       {
    	   System.out.println("even number existr");
       }
       
       
       /**=====================Check Palindrome==============*/
       
         String data ="hellehd";
          boolean hasPalindrome =  checkaPalindrome(data);
          
          if(hasPalindrome)
          {
             System.out.println("Palindrome");
          }
          else
          {
        	  System.out.println("Not Palindrom");
          }
          
          
          /**=====================Remove Whitespace==============*/
          
          StringBuilder outs = new StringBuilder();
          String datas = "  Hello \t World \n Java  ";
          char[]  chars = datas.toCharArray();
          
          for(int i=0;i<chars.length;i++)
          {
        	  if(!Character.isWhitespace(chars[i]))
        	  {
        		  outs.append(chars[i]);
        	  }
          }
           
          System.out.println(outs);
          
          
          /**=====================ArmStrong-Number==============*/
          
          int number=32;
          
       int result =   checkArmStrong(number);
       
       System.out.println(result+"========");
       
       
       
       /**=====================Factorial==============*/
       
       
       int n = 5;
       int fact =1;
       
       for(int i=1;i<=n;i++)
       {
    	   fact = fact*i;
       }
       
       System.out.println(fact);
       
       
       /**=====================Find  a perfect number==============*/
       
       int num =28;
       int sum=1;
       
       for(int i=2;i<=Math.sqrt(num);i++)
       {
    	   
    	   if(num % i==0)
    	   {
    		  sum=sum+i; 
    	   
    	   
    	   int pair = num/i;
    	   
    	   if(pair!=i)
    	   {
    		   sum= sum+pair;
    	   }
    	   
    	   }
    	   
       }
       
       System.out.println("pairrr"+sum);
       
       
       /**=====================Count Number Of Digits==============*/
       
       int numbers = 12345;
       int counts = 0;
       
       while(numbers!=0)
       {
    	   
    	   numbers =numbers/10;
    	   counts++;
       }
       
       System.out.println(counts);
       
      
       
       
     
     
       
       
          
          
          
           
           
           
           
           
           
           
           
           
    	  
        
        
        
        
		
		

	}

}
