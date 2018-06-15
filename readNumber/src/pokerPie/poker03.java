package pokerPie;

import java.util.LinkedList;

public class poker03 {

	public static void main(String[] args) {
		//q: 1) S1,H1,D1,
			  //S2,C2,S3,H4,H5,
			  //D6,D7,H8,D8,C8
		String[] poker13 = {"♠1","♥1","♦1",      //♠ 有 3 張
					"♠2","♣3","♠3","♥4","♥5",	 //♥ 有 4 張
					"♦6","♦7","♥8","♦8","♣8"}; 	 //♦ 有 4 張
		
		//找出以下這些機率:
		
		//--桐花順--  5張"花色"一樣"連續"的牌
		// ♠ ♠ ♠ ♠ ♠
		// ♥ ♥ ♥ ♥ ♥
		// ♦ ♦ ♦ ♦ ♦ 
		// ♣ ♣ ♣ ♣ ♣
		
		//分別放不同花色的資料:
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> list3 = new LinkedList<String>();
		LinkedList<String> list4 = new LinkedList<String>();

		
		//判斷 此陣列 每個花色有幾張 & 哪些元素:
		for(int i=0; i<poker13.length; i++) {
			if(poker13[i].charAt(0) == '♠') {	//如果是 ♠ 裝進 list1
				list1.add(poker13[i]);            
			}
			
			if(poker13[i].charAt(0) == '♥') {	//如果是 ♥ 裝進 list2
				list2.add(poker13[i]); 			 
			}
			
			if(poker13[i].charAt(0) == '♦') {	//如果是 ♦ 裝進 list3
				list3.add(poker13[i]);
			}
			
			if(poker13[i].charAt(0) == '♣') {	//如果是 ♣ 裝進 list4
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
		
		
		
		//擁有:
		//♠1 ♠2 ♠3 		黑桃 3 張
		//♥1 ♥4 ♥5 ♥8 	愛心 4 張
		//♦1 ♦6 ♦7 ♦8 	方塊 4 張
		//♣3 ♣8 		梅花 2 張
		//判斷  同花色是否有5張   即  可得到 「桐花」 這件事
		if(list1.size() == 5) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
		
		//--鐵支--    4張一樣 + 1張牌
		
		//--葫蘆--    3張一樣 + 2張一樣
		
		//--桐花--    5張花色一樣 但"不用有連續"
		
		//--順--      5張連續的牌
		
		//--三條--    3張一樣 + 2張牌
		
		//--2Pair--  2張一樣 + 2張一樣
		
		//--Pair--   2張一樣
		

	}

}
