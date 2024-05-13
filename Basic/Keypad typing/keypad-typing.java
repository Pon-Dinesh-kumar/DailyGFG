//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

// } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    StringBuilder str = new StringBuilder();
    for(int i=0; i<n; i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='c'){
            str.append(2);
        }
        else if(s.charAt(i)>='d' && s.charAt(i)<='f'){
            str.append(3);
        }
        else if(s.charAt(i)>='g' && s.charAt(i)<='i'){
            str.append(4);
        }
        else if(s.charAt(i)>='j' && s.charAt(i)<='l'){
            str.append(5);
        }
        else if(s.charAt(i)>='m' && s.charAt(i)<='o'){
            str.append(6);
        }
        else if(s.charAt(i)>='p' && s.charAt(i)<='s'){
            str.append(7);
        }
        else if(s.charAt(i)>='t' && s.charAt(i)<='v'){
            str.append(8);
        }
        else if(s.charAt(i)>='w' && s.charAt(i)<='z'){
            str.append(9);
        }
    }
    return str.toString();
}

//{ Driver Code Starts.

}

// } Driver Code Ends