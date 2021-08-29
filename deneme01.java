package Practises;

import java.util.Scanner;

public class deneme01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your weight and height");
		double weight= scan.nextDouble();
		System.out.println("your weight is "+weight);
		double height= scan.nextDouble();
		System.out.println("your height is "+height);
		double BMI=weight/(height*height);
		
		if (BMI<18.5) {  
		System.out.println("Your BMI is : "+BMI+" You are weak");  
		}   
		else if(18.5<=BMI && BMI<25)  {  
		System.out.println("Your BMI is : "+BMI+" Your weight is ideal");
		}
		else if (25<=BMI && BMI<30)  {
		System.out.println("Your BMI is : "+BMI+" You are fat");
		}
		else {
		System.out.println("You BMI is : "+ BMI+ " You are obese"); 
		}

scan.close();
	}

}
