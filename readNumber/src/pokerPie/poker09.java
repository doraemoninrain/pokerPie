package pokerPie;

public class poker09 {

	public static void main(String[] args) {
		String[] poker13 = {"♠2","♥4","♠7","♥13","♠5","♦7","♠8","♣10","♠9","♥6","♣1","♣3","♦2"};
		
		int[][] hand = new int[5][14];
		
		
		char flowerType;
		int whichNum = 0;
		
		for(int i=0; i<poker13.length; i++) {
			flowerType = poker13[i].charAt(0); //看花色
			whichNum = Integer.parseInt(poker13[i].substring(1, poker13[i].length())); //看數字
			//System.out.println(flowerType + ":" + whichNum);
			
			//--start of count flower type--
			if(flowerType == '♠') {
				hand[1][0] += 1; //將 黑陶 的 總和 放入 [1][0]位子
				
			}else if(flowerType == '♥') {
				hand[2][0] += 1;
				
			}else if(flowerType == '♦') {
				hand[3][0] += 1;
				
			}else if(flowerType == '♣') {
				hand[4][0] += 1;
				
			}//--end of count flower type--
			
			
			
			//--start of count 1-13 number--
			int j = 1;
			while(j<=13) {
				if(whichNum == j) {
					hand[0][j] += 1;
				}
				j++;
			}//--end of count count 1-13 number--
			
			
		}
		
		//精簡 花色 檢視 
		String a[] = {"♠","♥","♦","♣"};
		int u = 0;
		for(int i=1; i<=4; i++) {
			System.out.println( a[u++] + " 有: " + hand[i][0] + "個");
		}
		
		//精簡 數字 檢視
		int n[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};  
		int c = 0;
		for(int i=1; i<=13; i++) {
			System.out.println(n[c++] + "有: " + hand[0][i] + "個");
		}
		
		
		//System.out.println(countNum);
		
//		for(int i=0; i<4; i++) {
//			for(int j=1; j<14; j++) {
//				if(i == 0) {
//					System.out.println("♠"+j+"有:"+hand[i][j]+"個");
//				}else {
					//if(i == 1) {
//					System.out.println("♥"+j+"有:"+hand[i][j]+"個");
//				}else if(i == 2) {
//					System.out.println("♦"+j+"有:"+hand[i][j]+"個");
//				}else if(i == 3) {
//					System.out.println("♣"+j+"有:"+hand[i][j]+"個");
//				}
//			}
//		}
		
		
	}

}
