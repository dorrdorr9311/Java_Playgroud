import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LottoMachine machine = new LottoMachine();
		int[] arr = machine.generate();
		
		System.out.printf("생성 번호: ");
		int m = arr.length;
		for(int i = 0; i < m; i++ ) {
			System.out.printf("%d ", arr[i]);
		}
		
		
	}

}

class LottoMachine{
	private ArrayList<Integer> number;
	
	LottoMachine() {
		// TODO Auto-generated constructor stub
		number = new ArrayList<Integer>();
		for(int i = 0; i < 45; i++) {
			number.add(i);
		}
		Collections.shuffle(number);
	}
	public int[] generate(){
		int[] pickedNum = new int[6];
		
		
		for(int i = 0; i < 6; i++){
			
			pickedNum[i] = number.get(i);}
		
		return pickedNum;
 	
		}
}
	

