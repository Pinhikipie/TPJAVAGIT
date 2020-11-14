
public class Chien extends Animal implements Bruit{

	@Override
	public void seDeplacer(int x, int y) {
		// TODO Auto-generated method stub
		super.seDeplacer(x, y);
		System.out.println("Je bouge, WOUF");
	}

	public void faireDuBruit() {
		System.out.println("WOUUF WOUUF WOUUUF");
	}

	
}
