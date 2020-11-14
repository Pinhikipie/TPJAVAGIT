
public class Point {

	private int abs;
	private int ord;
	
	public Point (){
		this.abs=50;
		this.ord=50;
	}
	
	public void translation(int x, int y) {
		abs += x;
		ord += y;
	}
}
