package readNumber;

public class n04 
{
	private int [][] sudoku; 
	
	public n04(int[][] sudoku) {
		this.sudoku = sudoku;   //要將 參數 指派過去 給 全域變數，全域變數才不會是空
								//一定要用this 因為是這個類別的 物件 所以用this的物件，如果沒用this程式會以為是其他的宣告
	}

	public static void main(String[] args) {
		//a[][] 何以不能 ?  又何以不能 直接使用 #5 的 全域變數 ?
		int[][] sudoku = {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}
									};
		n04 n04 = new n04(sudoku);
		n04.findTheEmpty(0, 0);
	}
	
	
	private void findTheEmpty(int x, int y) {
		//how to find out the empty? -> if decision & (X,Y) position
		
		//(if x = 8, y = 9) will be right answer and be printed out:
		if(x == 8 && y == 9) {   //&  && ?
			print();
			return;
		}
		
		
		//if y = 9, go to next row. Because it should go on, so it be y = 9.
		if(y == 9) {
			x++;
			y = 0;
		}
		
		
		//if array value is 0, fill in & check.  
			//So we don't have to go around find, 0 be shown itself. 
		if(sudoku[x][y] == 0) {
			for(int a=1; a<=9; a++) {  //fill in 1~9
				if(check(x, y ,a)) {  //check if a is repeat				 -> step second
				sudoku[x][y] = a; //assign a to array value to full in       -> step first
				findTheEmpty(x, y + 1);  //find the next empty after filled in.
				sudoku[x][y] = 0;
				}
			}
		// else if it isn't 0, find the next row.
		}else {
			findTheEmpty(x, y + 1);
		}
		
	}
	
	private boolean check(int row, int column, int a) {
		//check three things as playing game.
		//1. check the "array value" of row with repetition
		for(int i=0; i<9; i++) {		 // -> step second
			if(sudoku[row][i] == a) {    // -> step first 
				return false;
			}
		}
		
		//2. check the "array value" of column with repetition
		for(int i=0; i<9; i++) {
			if(sudoku[i][column] == a) {
				return false;
			}
		}
		
		//3. check the "array value" of ninety-ninety box with repetition
		//find the Area
		int row_area = row / 3;
		int column_area = column / 3;
		//find back the neighbor -> row_area*3 ,  column_area*3 
		//find out the address
		for(int r=0; r<3; r++) {	 //outer array
			for(int j=0; j<3; j++) { //inner array
				if(sudoku[row_area * 3 + r][column_area * 3 + j] == a) {  //check if repeat
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	private void print() {
		//print out the array
		//we have 2D array, so looping twice
		
		for(int j=0; j<9; j++) { //outer array -> rows
			for(int i=0; i<9; i++) { //inner array -> a row
				System.out.print(sudoku[j][i] + " ");
			}
			System.out.println();
		}
	}
	

}







