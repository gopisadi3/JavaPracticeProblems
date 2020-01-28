// Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below. 
//Example: 
//If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore. 
//If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

import java.util.Scanner;
public class Demo { 
    	public static void main(String args[]) { 
    		String s1,s2; 
    		Scanner sc = new Scanner(System.in);
     		System.out.println("Enter 2 strings"); 
     		s1 = sc.nextLine();  
                 s2 = sc.nextLine(); 
    		System.out.println(s1+ " Technologies "+s2);
     	} 
    }




