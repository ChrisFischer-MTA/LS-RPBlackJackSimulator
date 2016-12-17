package crusty;

import java.util.Random;

public class game {
	
	boolean hasRedeals; 
	int upperBound;
	Random r = new Random();
	int pC = 0;
	int dC = 0;
	
	
	public game(int bound){
		this.upperBound = bound;
	}
	
	// 0 is redeal
	// 1 is playerWin
	// 2 is dealerWin
	public int runGame(){
		pC = 0;
		dC = 0;
		pC = pHand();
		dC = dHand();
		//System.out.println("d"+dC+"p"+pC);
		if(pC > 21){
			return 2;
		}
		if(dC > 21){
			return 1;
		}
		if(pC == dC){
			//System.out.println(dC +" " + pC);
			return 0;
		}
		if(pC > dC){
			return 1;
		}
		if(dC > pC){
			return 2;
		}
		return -1;
	}
	
	private int pHand(){
		while(pC < upperBound){
			pC += r.nextInt(7);
		}
		//System.out.println("PC "+pC);
		return pC;
	}
	
	private int dHand(){
		while(dC <= pC){//&& dC != pC){
			dC += r.nextInt(7);
		}
		//System.out.println("DC "+dC);
		return dC;
	}
}
