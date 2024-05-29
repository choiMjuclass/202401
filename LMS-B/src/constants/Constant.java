package constants;

public class Constant {
	public class MainFrame {
		final public static long VERSION_NUM = 1L;
		
		final public static String TITLE = "수강신청"; 
		
		final public static int X = 300; 
		final public static int Y = 100; 
		final public static int WIDTH = 600; 
		final public static int HEIGHT = 400; 
	}
	
	public class IndexTable {
		public enum EHeader {
			eId("아이디"),
			eTitle("이름");
			
			public String title;
			private EHeader(String title) {
				this.title = title;
			}
			public String getTitle() {
				return this.title;
			}
		}		
	}
}
