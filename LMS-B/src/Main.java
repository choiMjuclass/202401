import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println((char)0x07);
		int token = System.in.read();
		while (token != 0x0d) {
			System.out.println(token);
			token = System.in.read();
		}
		System.out.println(token);
		token = System.in.read();
		System.out.println(token);
	}

}
