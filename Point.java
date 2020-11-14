
public class Point {

	private int abs;
	private int ord;
	
	public Point (){
		this.abs=40;
		this.ord=40;
	}
	
	public void translation(int x, int y) {
		abs += x;
		ord += y;
	}
}
