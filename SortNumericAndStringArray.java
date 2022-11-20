package Exercises;

/*IN this Class i will use the sort method of JAVA Arrays class 
 * to sort the content of the arrays
*/
import java.util.Arrays;
public class SortNumericAndStringArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {1234,2345,2355,4,24,2,65};
		String[] my_array2 = {"Java","Python","Node.js","PHP",""};
		
		//Numeric Array Sort
		System.out.println("Before sort : "+ Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("After sort : "+ Arrays.toString(my_array1) );
		
		//String Array Sort
		System.out.println("Before sort : "+ Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("After sort : "+ Arrays.toString(my_array2) );
		
		
	}

}
