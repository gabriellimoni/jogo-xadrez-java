package boardgame;

public class BoardException extends RuntimeException {
	public static final long serialVersionUID = 1l;
	
	public BoardException (String msg) {
		super(msg);
	}
}
