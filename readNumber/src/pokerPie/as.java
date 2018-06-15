package pokerPie;

public class as {

	public static void main(String[] args) {
		String[] poker13 = {"♠2","♥4","♠7","♥13","♠5","♦7","♠8","♣10","♠9","♥6","♣1","♣3","♦2"};
		
		int[][] hand = new int[4][14];
		
		//System.out.println(hand[0][13]);
		
		char r;
		int num=0;
		for(int i=0; i<poker13.length; i++) {
			r = poker13[i].charAt(0);
			num = Integer.parseInt(poker13[i].substring(1, poker13[i].length()));
			//System.out.println(r+":"+num);
			
			if(r == '♠') {
				hand[0][num] += 1; 
			}else if(r == '♥') {
				hand[1][num] += 1;
			}else if(r == '♦') {
				hand[2][num] += 1;
			}else if(r == '♣') {
				hand[3][num] += 1;
			}
			
		}
		
		System.out.println("===================");
		
		for(int i=0; i<4; i++) {
			for(int j=1; j<14; j++) {
				if(i == 0) {
					System.out.println("♠"+j+"有:"+hand[i][j]+"個");
				}else if(i == 1) {
					System.out.println("♥"+j+"有:"+hand[i][j]+"個");
				}else if(i == 2) {
					System.out.println("♦"+j+"有:"+hand[i][j]+"個");
				}else if(i == 3) {
					System.out.println("♣"+j+"有:"+hand[i][j]+"個");
				}
			}
		}

	}

}

