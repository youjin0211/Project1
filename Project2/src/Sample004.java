/**
 * 
 */

/**
 * 
 */
public class Sample004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer("SAMSUNG", 256, "DESKTOP-1UI1DS0", 1);
		System.out.println("제조사:" + computer.getMaker()
		+", 하드용량:" + computer.getHdd()
		+", 이름:" + computer.getItem()
		+", 수량:" + computer.getQuantity());
	}

}
