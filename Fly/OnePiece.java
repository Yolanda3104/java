package Fly;

public class OnePiece extends APiece {
	public OnePiece(String inKind) {
		super(inKind);
	}
	
	@Override
	public void Play(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("把" + inKind + "子放在(" + x +"," + y + ")的位置");
	}

}
