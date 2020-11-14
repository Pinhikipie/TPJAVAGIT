
public class Point {

	private int abs;
	private int ord;
	
	public Point (){
		this.abs=10;
		this.ord=10;
	}
	
	public void translation(int x, int y) {
		abs += x;
		ord += y;
	}
}
