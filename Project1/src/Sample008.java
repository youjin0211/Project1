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
//		String[] movies = {
//			"터미네이터", "아바타", "타이타닉", "스파이더맨"
//		};
	
		String[] movies = new String[4];  // 4편의 영화 배열 생성
		movies[0] = "터미네이터";
		movies[1] = "아바타";
		movies[2] = "타이타닉";
		movies[3] = "스파이더맨";
		
		for (int i = 0; i < 4; i++) {
			System.out.println(movies[i]);
		}
		
		for (String m : movies) {
			System.out.println(m);
		}

	}

}
