package pacote_fabric;

public class OrdinaryMazeGame extends MazeGame{
	public Room makeRoom() {
		return new OrdinaryRoom();
	}
}
