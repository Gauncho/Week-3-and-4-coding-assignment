package scr;

import java.util.Scanner;

public class codingassignment {
	
	

	public static void main(String[] args) {
		int[] ages  = {3,9,23,64,2,8,28,93};
		System.out.println(ages[0]- (ages[ages.length-1]));
		
		int sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			
			sum = sum + ages[i];
		}
		int average = sum / ages.length;
		
		System.out.println("The average age is: "+ average);
		
		String[] names = {"Sam", "Tommy","Tim","Sally","Buck","Bob"};
		
		double countedLength = 0;
		 String allNames = " ";
		 
		for(int i = 0; i < names.length; i++) {
			countedLength += names[i].length();
			allNames = allNames + (names[i] + " ");
			
		}
		System.out.println(countedLength);
		System.out.println(countedLength/names.length);
		System.out.println(allNames);
		
		int[] nameLengths = {3, 5, 3, 5, 4, 3};
		
		int sumLengths = 0;
		
		for (int total : nameLengths) {
			sumLengths += total;
			System.out.println(sumLengths);
		}
		String repeatedNames;
		repeatedNames = repeatString("Preston", 12);
		System.out.println(repeatedNames);
		
		String fullName;
		fullName = fullname("Preston","Stewart");
		System.out.println(fullName);
		
		int [] numberOfPeople = {90, 9};
		System.out.println(sum(numberOfPeople));
		
		double [] array1 = { 40, 30, 20};
		double [] array2 = {10, 15, 20};
		System.out.println(diffAverage(array1, array2));
		
		System.out.println(willBuyDrink(true, 11.75));
		
		int [] razorbackPoints = {7, 7, 3, 6, 3};
		int [] alabamaPoints = {7, 7, 7, 7, 7, 7, 7};
		System.out.println(footballScores(razorbackPoints, alabamaPoints));
		
	}
	public static String repeatString(String name, int number) {
		String names = name.repeat(number);
		return(names);
	}
	public static String fullname(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	public static boolean sum(int [] numberOfPeople) {
		
		int allPeople = 0;
		for (int i = 0; i < numberOfPeople.length; i++) {
			allPeople = allPeople + numberOfPeople[i];
		}if (allPeople > 100) {
				return true;
				
			}else {
				return false;
			}
	}public static boolean diffAverage (double[] array1, double[]array2) {
		
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < array1.length; i++) {
			sum1 = sum1 + array1[i];
		}double average1 = sum1/array1.length;
		for (int j = 0; j < array1.length; j++) {
			sum2 = sum2 + array2[j];
		
		}double average2= sum2/array2.length;
		if (average1 > average2) {
			return true;
		}else {
			return false;
		}
	
	
		}
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if ((isHotOutside == true )&&(moneyInPocket > 10.50) ) {
				return true;
			}else {
				return false;
			}
			
		}
		public static String footballScores( int []razorbackPoints, int [] alabamaPoints) {
			int razorbackSum = 0;
			int alabamaSum = 0;
			for ( int i = 0; i< razorbackPoints.length; i++) {
				razorbackSum = razorbackSum + razorbackPoints[i];
			}for (int j = 0; j < alabamaPoints.length; j++) {
				alabamaSum = alabamaSum + alabamaPoints[j];
			} if (razorbackSum > alabamaSum) {
				return "Razorbacks win! WOO pig Soooiee!";
			}else {
				return "Alabama wins! Roll tide!";
			}
				
				
		}
	}
	


	
		
		
	

