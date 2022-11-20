package Exercises;

public class SumValueOfArray {
	
	public int calculSumArray(int [] array) {
		int sum = 0;
		for (int i : array) {
			sum +=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumValueOfArray sumValue = new SumValueOfArray();
		int [] myArray = {12,13,45,34};
		
		int sum = sumValue.calculSumArray(myArray);
		
		System.out.println(sum);
	}
	

}
