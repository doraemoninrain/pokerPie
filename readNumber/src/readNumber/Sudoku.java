package readNumber;

//將二微陣列 看作是 x y座標, excel 也算是二微的表示法
//一微 只是 一個長列 沒有座標規則, 所以在判斷行與宮的位子時, 會寫更複雜的方法 -> 不可取

public class Sudoku {  
    private int[][] sudoku;  
  
    public Sudoku(int[][] sudoku) {  
        this.sudoku = sudoku;  
    }  
  
    public static void main(String[] args) {      
        int[][] sudoku = {  
                {5, 3, 0, 0, 7, 0, 0, 0, 0},  
                {6, 0, 0, 1, 9, 5, 0, 0, 0},  
                {0, 9, 8, 0, 0, 0, 0, 6, 0},  
                {8, 0, 0, 0, 6, 0, 0, 0, 3},  
                {4, 0, 0, 8, 0, 3, 0, 0, 1},  
                {7, 0, 0, 0, 2, 0, 0, 0, 6},  
                {0, 6, 0, 0, 0, 0, 2, 8, 0},  
                {0, 0, 0, 4, 1, 9, 0, 0, 5},  
                {0, 0, 0, 0, 8, 0, 0, 7, 9}};  
        Sudoku s = new Sudoku(sudoku);  
        s.findTheEmpty(0, 0);//從0,0位置開始找   
    }  
  
    //findTheEmpty
    private void findTheEmpty(int x, int y) {
    	
    	//if Row Completed, pls do as:
        if (x == 8 && y == 9) {//如果都等於x座標等於8,y座標等於9代表全部解完了  
            print();  //印出解完的陣列
            return;  
        } 
        //之所以此段，是因為先判斷row。  當然一開始是 0 0這個位子，所以也不會進入一二段的方法。
        
        //if Column Completed, pls do as:
        if (y == 9) {  //如果x座標等於9時代表要換行了換 x座標+1,y座標歸0
            x++;  
            y = 0;  
        }  
        
        //if array is empty, pls do FILL IN:
    	if (sudoku[x][y] == 0) {  //如果是空格才進行填值
            for (int fill_in = 1; fill_in <= 9; fill_in++) {  //依序填入數字1~9         	
                if (check(x, y, fill_in)) { //去check方法判斷是否重複 
                	sudoku[x][y] = fill_in;  //如果回傳true就把該個0填入賦予的值 
                	findTheEmpty(x, y + 1); //find the next empty after filled in.   /    往下一格尋找    y座標+1
                    sudoku[x][y] = 0; //assigned array = 0 again
                }  
            }  
        } else {  //如果此格不是0往下一格尋找   y座標+1
        	findTheEmpty(x, y + 1); //不斷地呼叫自己: 地迴。   因為會一直呼叫自己，如果先執行此段，則後二三段都不會執行了。
        }  
        
    }  
  
    
    //同時檢查這三件事情
    private boolean check(int row, int columns, int number) {  //(row(橫的),columns(直的),當前試填入的數字)
        //判斷row有沒有重複數字
        for (int i = 0; i < 9; i++) {  
            if (sudoku[row][i] == number) {  
                return false;  
            }  
        }
        
        //判斷columns有沒有重複數字
        for (int i = 0; i < 9; i++) {  
            if (sudoku[i][columns] == number) {  
                return false;  
            }  
        }  
        
        
        int Lattice_Row = row / 3;  
        int Lattice_Column = columns / 3;  
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {  
                if (sudoku[Lattice_Row * 3 + i][Lattice_Column * 3 + j] == number) { //判斷九宮格是否重複 
                    return false;  
                }  
            }  
        }  
  
        return true;  //沒重複回傳ture
    }  
  
    
    public void print() {  
        for (int i = 0; i < 9; i++) {  
            for (int j = 0; j < 9; j++) {  
                System.out.print(sudoku[i][j] + " ");  //加空字串 只是畫面有空格 比較好閱讀。   恩，這樣只是在找位子而已，所以不影響題目。
            }  
            System.out.println(); //每9個段行 
        }   
    } 
    
    
}  










