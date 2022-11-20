package Exercises;

public class TestValue {

	public boolean testValueArray(int value, int []array) {
		for(int i=0; i<array.length; i++) {
			if(value == array[i]) {
				return true;
			}
		}
		return false;
	}
	
	

}
