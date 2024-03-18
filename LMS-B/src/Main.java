import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		int tokens[] = new int[10];
		
		int count = 0;		
		int token = System.in.read();
		while (token != 0x0d) {
			token = token & 0x0000000F;
			if (count == 0) {
				token0 = token;
				System.out.println(token0);
			} else if (count == 1) {
				token1 = token;
				System.out.println(token1);
			} else if (count == 2) {
				token2 = token;
				System.out.println(token2);
			}
			token = System.in.read();
			count = count + 1;
		}
		System.out.println(token);
		token = System.in.read();
		System.out.println(token);
		
		int result = token0*100 + token1*10 + token2;
		System.out.println(result);

	}

}
