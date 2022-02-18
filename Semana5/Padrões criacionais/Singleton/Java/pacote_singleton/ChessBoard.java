package pacote_singleton;

/*
 * Esta implementação permite que o objeto seja criado no momento da inicialização do programa
 */
public class ChessBoard {
	private static ChessBoard chessBoard = new ChessBoard();
	
	
	private ChessBoard() {
		
	}
	/*
	 * O construtor é privado, ou seja, nenhuma outra classe consegue instanciar objetos desta classe em particular
	 */
	
	public static ChessBoard getBoard() {	
		return chessBoard;
	}
	
	public static void main(String[] args) {
		ChessBoard tabuleiro1 = ChessBoard.getBoard();	
        ChessBoard tabuleiro2 = ChessBoard.getBoard();
        	
        System.out.println(tabuleiro1.toString());
        System.out.println(tabuleiro2.toString());

	}
}
