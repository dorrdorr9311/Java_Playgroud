import java.util.ArrayList;

public class TotalChickenPrice {
	public static void main() {
		ArrayList<Chicken> order = new ArrayList<Chicken>();
			order.add(new Chicken("후라이드", 9900));
			order.add(new Chicken("로스트", 9900));
			order.add(new Chicken("양념", 10900));
			order.add(new Chicken("간장", 10900));
			order.add(new Chicken("파닭", 12900));
			order.add(new Chicken("마늘아", 13900));
	
		int sum = 0;
		for(int i = 0; i < 6; i++) {
					
			sum += (order.get(i)).getPrice();
		}
		System.out.printf("총합: %d원\n", sum);
	}

}

class Chicken{
	
	private String name;
	private int price;
	
	public Chicken(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
}