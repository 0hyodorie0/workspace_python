package day03;

public class OopTest {
	public static void main(String[] args) {
		Human hum = new Human();
		System.out.println(hum.age);
		System.out.println(hum.skillLang);
		hum.aging();
		hum.momsTouch(5);
		System.out.println(hum.age);
		System.out.println(hum.skillLang);
	}
}
