package pacote_fabric;

public class MagicMazeGame extends MazeGame{
	
	public Room makeRoom() {
		return new MagicRoom();
	}

}