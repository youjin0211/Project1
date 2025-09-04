import java.security.PublicKey;

public class Book implements Item{  //Book은 Item을 상속한다
	
	private String type;  //책의 타입(만화책, 소설책, 오디오북...)
	private String item; // 아이템 이름(챡1)
	private int quantity;  //수량(10권)
	
	public Book(String type, String item, int quantity) {
		//super(item, quantity);  //반드시 맨앞에 작성
		this.type = type;
		this.item = item;
		this.quantity = quantity;
	}
	
	//타입에 대한 겟터 작성
	public String getType() {
		return type;
	}
	
	public String getType() {
		return type;
	}
	
	public
	
	@Override
		public void displayInfo() {
			System.out.println("책 카테로기:" + type + ", 제목:" +
		            getname() + ",수량: " + getQuantity());
			
		}
	
	@Override
	public String toString() {
		return "타입:" + type + ",이름:" + getItem() +
				",수량:" + getQuantity();
	}

}
