import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// @input char array
		// @output char array
		// input을 Binary number 변형하여 Integer variable 에 저앙
		final int LINE_FEED = 0x0a;
		final int CARRIAGE_RETRUN = 0x0d;
		
		int number[] = new int[10];
		int count = 0;
		number[count] = System.in.read();
		while(number[count] != CARRIAGE_RETRUN) {
			number[count] = number[count] & 0x0000000F;
			System.out.println(number[count]);
			count = count + 1;
			number[count] = System.in.read();
		}
		
		int result = 0;		
		int position = 1;
		count = count - 1;
		while(count >= 0) {
			result = result + number[count] * position;
			position = position * 10;
			count = count - 1;
		}
		System.out.println(result);
	
//		System.out.println(result);
	}
}
