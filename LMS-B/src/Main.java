import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// @input : ASCII Numbers
		// @output: integer Numbers
		// @Rule: 입력값을 int Value로 변환, 자리수에 따라 가중치를 곱해주기
		
		// ASCII Number 입력 받기
		final int CARRIAGE_RETRURN = 0x0d;
		
		int tokens[] = new int[10];		
		int count = 0;		
		tokens[count] = System.in.read();
		while (tokens[count] != CARRIAGE_RETRURN) {
			System.out.println(tokens[count]);			
			count = count + 1;
			tokens[count] = System.in.read();
		}
		
		
		int result = 0;
		int poistion = 1;
		count = count - 1;
		while (count >= 0) {
			tokens[count] = tokens[count] & 0x0000000F;
			result = result + tokens[count] * poistion;
			poistion = poistion * 10;
			count = count - 1;
		}				
		System.out.println(result);
		
		

	}

}
