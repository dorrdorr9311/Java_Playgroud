import java.util.ArrayList;
import java.util.function.BiConsumer;

public class TotalPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item shirts = new Item("스트라이프 셔츠", 49900); 
		Item pants = new Item("면바지", 58900); 
		Item snikers = new Item("스니커즈", 46900); 

		Cart cart = new Cart();
		cart.add(shirts);
		cart.add(pants);
		cart.add(snikers);
		
		System.out.printf("총합: %d원", cart.totalPrice());
	}

}
class Cart{
	private ArrayList<Item> list;
	
	public Cart(){
		this.list = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	public int totalPrice(){
		int sum = 0;
		int n = list.size();
		for(int i = 0; i < n; i++) {
			sum += (list.get(i)).getPrice();
		}
		return sum;
	}
	
	
}

class Item{
	 
	private String name;
	private int price;
	
	public Item(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}