package pacote_fabric;

import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame {
	private final List<Room> rooms = new ArrayList<>(); 
    private Room room1;
    private Room room2;
	public MazeGame() {
		//O construtor recebe as instâncias, mas essa classe não é responsável por criá-las
		room1 = makeRoom();
		room2 = makeRoom();
		room1.connect(room2);
	}

    public void play(){
            System.out.println(room1.toString());
    }

	public abstract Room makeRoom();
}
