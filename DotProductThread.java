package homework6;

public class DotProductThread extends Thread {
	private int[] v1;
	private int[] v2;
	private int dot;

	public DotProductThread(int[] v1, int[] v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	@Override
	public void run() {
		int dot_product = 0;
		for (int i = 0; i < v1.length; i++) {
			dot_product += v1[i] * v2[i];
		}
		setDot(dot_product);
	}

	public int getDot() {
		return dot;
	}

	public void setDot(int dot) {
		this.dot = dot;
	}

}
