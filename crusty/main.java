package crusty;

import java.util.Random;

public class main {
	
	public static void main(String[] arg){
	for(int i = 3; i < 21; i++){
		System.out.println("Running simulation with bound "+i);
		System.out.println("Win percentage "+runGameSim(i, 19389012));
	}
	}
	
	
	public static float runGameSim(int bound, int numberOfGames){
		game g = new game(bound);
		int gamesWon=0;
		int gamesLost=0;
		int gamesRedealt=0;
		int totalGames = 0;
		int currentStat = 0;
		for(int i = 0; i < numberOfGames; i++){
			currentStat = g.runGame();
			totalGames++;
			//System.out.println(currentStat);
			if(currentStat == 0)
				gamesRedealt++;
			else if(currentStat == 1)
				gamesWon++;
			else if(currentStat == 2)
				gamesLost++;
		}
		System.out.println("t" + totalGames);
		System.out.println("w" + gamesWon);
		System.out.println("l" + gamesLost);
		System.out.println("r" + gamesRedealt);
		return (gamesWon/(float)(totalGames));
	}

}
