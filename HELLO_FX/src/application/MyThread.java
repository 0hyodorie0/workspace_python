package application;

public class MyThread {

	public static void showMunja() {
		for (int i = 1; i <= 1000000; i++) {
			System.out.print((char)i);
			if (i % 100 == 0)
				System.out.println();
		}
	}
	public static void showNum() {
		for (int i = 1; i <= 1000000; i++) {
			System.out.print(i);
			if (i % 100 == 0)
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		showNum();
		showMunja();
	}

}
