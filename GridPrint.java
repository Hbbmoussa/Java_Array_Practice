package Exercises;


public class GridPrint {

	public void printGrid() {
		for(int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("-");
			}
			System.out.println("");

		}
	}
	
	public void printGridArray(int [][]array) {
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<10; j++) {
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridPrint gridPrint = new GridPrint();
		gridPrint.printGrid();

	}

}
