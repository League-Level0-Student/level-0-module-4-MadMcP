package extra;

public class SpudCounter {

	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			if (i%8==0) {
				System.out.print("more");
			}
			else if (i%4==0) {
				System.out.println(i+ " ");
			}
			else {
				System.out.print(i+ " potato, ");
			}
		}
	}
}
