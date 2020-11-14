
public class Chat extends Animal implements Bruit{

	@Override
	public void seDeplacer(int x, int y) {
		// TODO Auto-generated method stub
		super.seDeplacer(x, y);
		System.out.println("Je bouge, MIAOU");
	}

	public void faireDuBruit() {
		System.out.println("MIAOU MIAOU MIAOU");
	}
}
