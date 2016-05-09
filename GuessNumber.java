import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessNumber {

	public Integer getRandomNumber(int minNo, int maxNo) {
		//System.out.println("Minmun no : " + minNo + " and Maximum No : "+ maxNo);
		Random r = new Random();
		return r.nextInt(maxNo - minNo + 1) + minNo;
	}

	public static void main(String[] args) {
		GuessNumber gGame = new GuessNumber();
		try {
			int min, max;
			min = 1;
			max = 100; 
			
			System.out.println("Hello user! To Start the game please select one no between " + min + " and "+ max);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("To start the game press Y : ");
			String startGame = br.readLine().toLowerCase();
			if (startGame.equals("y")){
				boolean canRun = true;
				do{
					Integer randomNo = gGame.getRandomNumber(min, max);
					System.out.println("Is the number : " + randomNo);
					String result = br.readLine().toLowerCase();
					if (result.equals("higher")){
						min = randomNo;
					}else if (result.equals("lower")){
						max = randomNo;
					}else if (result.equals("yes")){
						System.out.println("U choosses " + randomNo + " Number");
						canRun = false;
					}
				}while (canRun);
			}
			else{
				System.out.println("See u next time, Exiting the Game...");
			}
			
		} catch (Exception e) {
			System.out.println("Exception thrown  :" + e);
		}
	}

}
