import java.util.ArrayList;



public class Totalsales{
	public static void main(String[] args) {
		
		Menu kimbab = new Menu("김밥", 2000, 57); 
		Menu pork = new Menu("돈가스", 6000, 29); 
		Menu coldnoodle = new Menu("냉면", 5000, 34); 
		
		Store order = new Store();
			order.add(kimbab);
			order.add(pork);
			order.add(coldnoodle);
		
		int a = order.totalSales();
		System.out.printf("총 매출: %d원", a );
	}
}

class Store{
	ArrayList<Menu> list;

	Store(){
		this.list = new ArrayList<Menu>();
	}
	public void add(Menu menu){
		list.add(menu);
	}
	 public int totalSales() {
		 int sum = 0;
		 int m = list.size();
		 for(int i = 0; i < m; i++) {
			 int a = list.get(i).getCount();
			 int b = list.get(i).getPrice();
			 sum += a*b;
		 }
		 return sum;
	 }
	 
	
}

class Menu{
	private String name;
	private int price;
	private int count;
	
	Menu(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count; 
	}
	
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
}