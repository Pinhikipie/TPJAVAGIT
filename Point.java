
public class Point {

	private int abs;
	private int ord;
	
	public Point (){
		this.abs=30;
		this.ord=30;
	}
	
	public void translation(int x, int y) {
		abs += x;
		ord += y;
	}
}
