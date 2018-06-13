package pokerPie;

public class poker02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ♠ ♠ ♠
//		System.out.println("♠");
//		System.out.println("♥");
//		System.out.println("♦");
//		System.out.println("♣");
		
		//test:
//		String a = "♥1";
//		System.out.println(a);

		
		//q: 1) S1,H1,D1,
			  //S2,C2,S3,H4,H5,
			  //D6,D7,H8,D8,C8
		String[] poker13 = {"♠1","♥1","♦1",      //♠ 有 3 張
					"♠2","♣3","♠3","♥4","♥5",	 //♥ 有 4 張
					"♦6","♦7","♥8","♦8","♣8"}; 	 //♦ 有 4 張
		for(String one : poker13) { 			 //♣ 有 2 張        //共 13 張 
			System.out.println(one);
		}
		System.out.println("有 " + poker13.length + " 張牌");
		
		//找出以下這些機率:
		
		//--桐花順--  5張"花色"一樣"連續"的牌
		// ♠ ♠ ♠ ♠ ♠
		// ♥ ♥ ♥ ♥ ♥
		// ♦ ♦ ♦ ♦ ♦ 
		// ♣ ♣ ♣ ♣ ♣
		//取出字串某個位置 charAt(int index)
		//test
		String string = "♦6";
		System.out.println(string.charAt(0));  //♦
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		//判斷 此陣列 每個花色有幾張:
		for(int i=0; i<poker13.length; i++) {
			if(poker13[i].charAt(0) == '♠') {
				//我要程式 幫我印出 所有♠的元素 與 元素個數有幾個:
				//String a = (poker13[i].charAt(0) == '♠');
				
				//System.out.println(a);
			}
			if(poker13[i].charAt(0) == '♥') {
				count2++;
				System.out.println("s" + poker13[i]);
			}
			
		}
		System.out.println("有幾張 ♥ 呢?: " + count2);
		
		
		
		//--鐵支--    4張一樣 + 1張牌
		
		//--葫蘆--    3張一樣 + 2張一樣
		
		//--桐花--    5張花色一樣 但"不用有連續"
		
		//--順--      5張連續的牌
		
		//--三條--    3張一樣 + 2張牌
		
		//--2Pair--  2張一樣 + 2張一樣
		
		//--Pair--   2張一樣
		

	}

}
