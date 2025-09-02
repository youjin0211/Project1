/**
 * For문
 */

/**
 * 
 */
public class Sample008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] movies = {
			"터미네이터", "아바타", "타이타닉", "스파이더맨"
		};
		
		for (int i = 0; i < 4; i++) {
			System.out.println(movies[i]);
		}
		
		for (String m : movies) {
			System.out.println(m);
		}

	}

}
