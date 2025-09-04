/**
 * 
 */

/**
 * 
 */
public class Sample005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item = new Item("아이템", 1);
		
		Book book = new Book("IT", "책1", 1);
		Computer com = new Computer("삼성", 256, "마이컴", 1);
		
		book.displayInfo();
		com.displayInfo();
		
		//item = com; // 큰 수가 작은 수를 받는 개념과 동일
		
		//System.out.println(item);
		//System.out.println(item.getType());
		if(item instanceof Book) {
			Book book2 = (Book)item; //작은 수가 큰 수를 받기위해 명시적 캐스팅
			System.out.println(book2.getType());
		} else if (item instanceof Computer) {
			Computer com2 = (Computer)item;
			System.out.println(com2.getMaker());
			com2.displayComputer("1599-9876");
		}
		
		
		
	

	}

}
