package Exercises;

public class ArrayFindMaxAndMin {
	/*This method return true if the number is the max inside the array
	 * and false else
	 * */
	 public boolean isTheMaxOrNot(int[] array,int max) {
		 int verification = 0;
		 for(int i=0; i<array.length; i++) {
			 if(array[i] < verification ) {
				 verification = array[i]; 
			 }
		 }
		 if(verification < max) {
			 return true;
		 }
		 return false;
	 }
	 /*This method return true if the number is the min inside the array
	* and false else
	* */
		 public boolean isTheMinOrNot(int[] array,int number) {
			 int verification = 0;
			 for(int i=0; i<array.length; i++) {
				 if(array[i] < verification ) {
					 verification = array[i]; 
				 }
			 }
			 if(verification < number) {
				 return false;
			 }
			 return true;
		 }

}
