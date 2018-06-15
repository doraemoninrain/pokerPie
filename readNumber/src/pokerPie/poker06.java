package pokerPie;

import java.util.Collections;
import java.util.LinkedList;

public class poker06 {

	public static void main(String[] args) {
		//q: 1) S1,H1,D1,
			  //S2,C2,S3,H4,H5,
			  //D6,D7,H8,D8,C8
		String[] poker13 = {"♠1","♥1","♦1",      //♠ 有 3 張
					"♠2","♣2","♠3","♥4","♥5",	 //♥ 有 4 張
					"♦6","♦7","♥8","♦8","♣13"}; 	 //♦ 有 4 張
												 //♣ 有 2 張
		
		//把題目排成字串 才能去subString(1, x.length-1)吧?
//		String z,x,c,v,b,n,m,a,s,d,f,g,h;
//		z = "♠1"; x = "♥1"; c = "♦1"; v = "♠2"; b = "♣2"; n = "♠3"; m = "♥4"; 
//		a = "♥5"; s = "♦6"; d = "♦7"; f = "♥8"; g = "♦8"; h = "♣8";
		
		//int[0][z.substring(1, (z.length()-1))] hand = 1;

		//分成 圖示 與 數字 的 不同容器，較好排列
		 //容器  裝  個別數字有幾個 -> 2:兩個  3:一個  4:一個 5:一個... 8:三個...
		 //將題目一樣用 拆字串 把數字相同的歸納出來? 那不就要判斷13次? 寫成二微陣列?
//		for(int i=0; i<poker13.length; i++) {
//			if() {	
//				            
//			}
		
		int[][] hand = new int[5][14];  //[1-4花色][13張牌] -> [5][14] 01234:
					   //								   [1][0] 存黑桃 出現幾次
					   //								   [2][0] 存紅心 出現幾次
					   //								   [3][0] 存方塊 出現幾次
					   //								   [4][0] 存梅花 出現幾次
										//-> 0~13:
						//[0][0],[0][1],[0][2],[0][3],[0][4],[0][5]...,[0][12],[0][13]  存放 1~13的數字 個出現幾次
		
		
		
		
		 //容器 裝 不同花色 各有幾個:
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> list3 = new LinkedList<String>();
		LinkedList<String> list4 = new LinkedList<String>();

		int count = 0;
		
		//判斷 此陣列 每個花色有幾張 & 哪些元素:
		char r;
		for(int i=0; i<poker13.length; i++) {
			r = poker13[i].charAt(0); //花色
			int num = Integer.parseInt(poker13[i].substring(1, (poker13[i].length()))); //數字
			//System.out.println(r+":"+num);

			
			
			if(r == '♠') {	//如果是 ♠ 請在hand[1][0] 做count
				count++;
				//hand[1][count++];
				//poker13[i] 就等於 x
				//list1.add(poker13[i]);            
			}else if(r == '♥') {	//如果是 ♥ 裝進 list2
				list2.add(poker13[i]); 			 
			}else if(r == '♦') {	//如果是 ♦ 裝進 list3
				list3.add(poker13[i]);
			}else if(r == '♣') {	//如果是 ♣ 裝進 list4
				list4.add(poker13[i]);
			}
			
		}
				
		//list1 有哪些元素 & 元素個數
		for(int i=0; i<list1.size(); i++) {		
			System.out.println(list1.get(i));
			
		}
		System.out.println("黑桃 " + list1.size() + " 張");		

		//list2 有哪些元素 & 元素個數
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("愛心 " + list2.size() + " 張");

		//list3 有哪些元素 & 元素個數
		for(int i=0; i<list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		System.out.println("方塊 " + list3.size() + " 張");
		
		//list4 有哪些元素 & 元素個數
		for(int i=0; i<list4.size(); i++) {
			System.out.println(list4.get(i));
		}
		System.out.println("梅花 " + list4.size() + " 張");
		
		
		fiveFlower(list1);
		//擁有:
		//♠1 ♠2 ♠3 		黑桃 3 張
		//♥1 ♥4 ♥5 ♥8 	愛心 4 張
		//♦1 ♦6 ♦7 ♦8 	方塊 4 張
		//♣3 ♣8 		梅花 2 張
		//判斷  同花色是否有5張   即  可得到 「桐花」 這件事
		
		//方法: 桐花順5張"花色"一樣"連續"
		
		//Illegal modifier for parameter fiveFlower; only final is permitted?
		
		
		//--鐵支--    4張一樣 + 1張牌
		
		//--葫蘆--    3張一樣 + 2張一樣
		
		//--桐花--    5張花色一樣 但"不用有連續"
		
		//--順--      5張連續的牌
		
		//--三條--    3張一樣 + 2張牌
		
		//--2Pair--  2張一樣 + 2張一樣
		
		//--Pair--   2張一樣
		

	}
	
	private static void fiveFlower(LinkedList<String> list1) {
		if(list1.size() == 5) {
			System.out.println("yes");
			Collections.sort(list1);
//			for (int i : list1) {   //要將 圖示字串 與 數字 在 一開始 分類時候 做不同容器的放置，在collection.sort分類的時候程式才能夠辨識int
//		        System.out.println(i);
//		    }
//		}else {
//			System.out.println("no");
		}
	}

}
