package com.Bootcamp.Easy_Part1_10programing;

import java.util.Random;

public class Generate_RendomNumberQ95 {

	 public static void main(String[] args) {
	        
	        Random random = new Random();// Create an Object of Random class
	        
	        int randomNumber = random.nextInt(100) + 1; //  random number between 1 and 100
	      
	        System.out.println("the random number its : " + randomNumber); // Print the random number
	    }
	}
