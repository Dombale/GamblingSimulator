package gamblingsimulator;

public class GamblingSimulator {
	// Initialization
	static int stake = 100;
	static int betForGame = 1;

	public static void main(String[] args) {

		System.out.println("Welcome in Gambling Simulator...!!");
		winloose(); // call to winloose method

	}

	static void winloose() {
		int randomNum = (int) (Math.random() * 2); // create random number using math function
		System.out.print(randomNum);

		if (randomNum == 1) // condition for win
		{
			stake++; // stake will increase by 1 if win
			System.out.println(" You win , stake is : " + stake);

		} else {
			stake--; // else stake will decrease by 1 if lose
			System.out.println(" You lose ,stake is :  " + stake);
		}

	}

}
