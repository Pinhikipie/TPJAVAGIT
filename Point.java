
public class Point {

	private int abs;
	private int ord;
	
	public Point (){
		this.abs=20;
		this.ord=20;
	}
	
	public void translation(int x, int y) {
		abs += x;
		ord += y;
	}
}
