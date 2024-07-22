package com.Bootcamp.Easy_Part1_10programing;

public class Check_String_IsPalindromeQ91 {

	 public static void main(String[] args) {    
	        String string = "LEVEL";    
	       boolean flag = true;    
	        //using the loop for string forward and backward, check one character at a time     
	        //to the middle of the string is reached    
	        for(int i = 0; i < string.length()/2; i++){   
	        	
	            
	            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
	                flag = false;    
	                break;    
	            }    
	        }    
	        if(flag)    
	            System.out.println("Given string is palindrome");    
	        else    
	            System.out.println("Given string is not a palindrome");    
	            
	    }    
	}    
