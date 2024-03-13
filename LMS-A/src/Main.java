import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println((char)0x07);
		char token = (char)System.in.read();
		while(token != 0x0a) {
			System.out.println(token);
			token = (char)System.in.read();
		}
		System.out.println(token);
	}

}
