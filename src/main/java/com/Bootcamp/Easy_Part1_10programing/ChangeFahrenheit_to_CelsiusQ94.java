package com.Bootcamp.Easy_Part1_10programing;

public class ChangeFahrenheit_to_CelsiusQ94 {

	public static void main(String[] args) {
	
		System.out.println(convertFromFarhenheitToCelsisus(99.50));
	}
public static double convertFromFarhenheitToCelsisus(double F) {
	double C = (F-32)/1.8;
	return C;
}
}
