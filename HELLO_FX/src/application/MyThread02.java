package application;

public class MyThread02 {
	
	
	public static void showNum(){
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000000; i++) {
					System.out.print(i);
					if (i % 100 == 0)
						System.out.println();
				}
			}
		}).start();
	}
	public static void showMunja(){
		new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000000; i++) {
					System.out.print((char)i);
					if (i % 100 == 0)
						System.out.println();
				}
			}
		}).start();
	}
	
	public static void main(String[] args) {
		showNum();
		showMunja();
	}

}
