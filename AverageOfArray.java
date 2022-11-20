package Exercises;



public class AverageOfArray {

	public double calculAverage(int[]array) {
		int arrayLength = array.length;
		int sum =0;
		double average ;
		for (int i=0; i<array.length; i++) {
			sum +=array[i];
		}
		average = sum/arrayLength;
		
		return average;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] my_array = {1,2,3,4,5};
		AverageOfArray my_average = new AverageOfArray();
		double average = my_average.calculAverage(my_array);
		System.out.print(average);
	}

}
