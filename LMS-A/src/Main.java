import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int number[] = new int[10];
		int count = 0;
		int code = System.in.read();
		while(code != 0x0a) {
			System.out.println(code);
			if (count == 0) {
				number0 = code & 0x0000000F;
				System.out.println(number0);
			} else if (count == 1) {
				number1 = code & 0x0000000F;
				System.out.println(number1);
			} else if (count == 2) {
				number2 = code & 0x0000000F;
				System.out.println(number2);
			}
			count = count + 1;
			code = System.in.read();
		}
		int result = number0*100+number1*10+number2*1;
		System.out.println(result);
	}
}
