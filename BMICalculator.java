package com.BMICalculator.www;

import java.util.Scanner;

public class BMICalculator {
	public String bmiCalculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in kilograms :");
		double weight = sc.nextDouble();
		System.out.println("Enter Height in metres :");
		double height = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.printf("Your BMI : %.2f\n",bmi);
		if(bmi<=0) {
			return "Invalid details";
		}
		else if(bmi < 18.5) {
			return "UnderWeight";
		}
		else if(bmi>=18.5 && bmi<25) {
			return "Healthy";
		}
		else if(bmi>=25 && bmi<30) {
			return "Overweight";
		}
		else if(bmi>=30 && bmi<=35) {
			return "Obese";
		}
		else {
			return "Morbid Obesity";
		}
	}

	public static void main(String[] args) {
		BMICalculator calc = new BMICalculator();
		System.out.println(calc.bmiCalculator());
	}

}
