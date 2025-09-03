/**
 * Arraylist를 생성하고 추가하는 예제
 */

import java.util.ArrayList;

/**
 * @author youjin
 */
public class Sample002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList<String>();
		books.add("오늘두 잘 살았습니두");
		books.add("파과");
		books.add("우울하지만 떡볶이는 먹고 싶어");

		
		for (String book : books) {
			System.out.println(book);
		}
	}

}
