import java.util.Scanner;

public class GuGuDan {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단을 출력하시겠습니까? :  ");
		int i = sc.nextInt();
		
		for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d%n",i,j,i*j);
			}
		}
}


