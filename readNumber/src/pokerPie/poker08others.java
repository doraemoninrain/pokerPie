package pokerPie;

public class poker08others {

	public static void main(String[] args) {
		String[] poker13 = {"♠2","♥4","♠7","♥13","♠5","♦7","♠8","♣10","♠9","♥6","♣1","♣3","♦2"};
		
		int[][] hand = new int[4][13];
		
		//System.out.println(hand[0][13]);  
		
		int[] countFlwer = new int[4];
		int countNum = 0;
		char flowerType;
		int whichNum=0;
		for(int i=0; i<poker13.length; i++) {
			flowerType = poker13[i].charAt(0); //看花色
			whichNum = Integer.parseInt(poker13[i].substring(1, poker13[i].length())); //看數字
			//System.out.println(r+":"+num);
			int chk =0;
			if(flowerType == '♠') {
				countFlwer[0]++;
				chk = 0;
				//countNum = hand[0][whichNum] += 1;  //這樣會變成 他是黑桃 又是 9 的 有幾張了
			}else if(flowerType == '♥') {
				//hand[1][whichNum] += 1;
			}else if(flowerType == '♦') {
				//hand[2][whichNum] += 1;
			}else if(flowerType == '♣') {
				//hand[3][whichNum] += 1;
			}
			
			int j = 0;
			while(j<=12) {
				if(whichNum == j+1) {
					hand[chk][j]++;
					break;
				}
				j++;
			}
			
			
		}
		System.out.println(countFlwer);
		System.out.println(countNum);
		
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
		
		
		// 要直接得到 :
		   //	[1][0] 存黑桃 出現幾次
		   //	[2][0] 存紅心 出現幾次
		   //	[3][0] 存方塊 出現幾次
		   //	[4][0] 存梅花 出現幾次
		// 與
		  //-> 0~13:
		  //[0][0],[0][1],[0][2],[0][3],[0][4],[0][5]...,[0][12],[0][13]  存放 1~13的數字 個出現幾次

		
	}

}
