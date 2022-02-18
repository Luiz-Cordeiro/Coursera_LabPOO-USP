package pacote_fabric;

public class Client {

	public static void main(String[] args) {
	
		MagicMazeGame magicMazeGame = new MagicMazeGame();

        OrdinaryMazeGame ordinaryMazeGame = new OrdinaryMazeGame();

        magicMazeGame.play();
        ordinaryMazeGame.play();
	}

}