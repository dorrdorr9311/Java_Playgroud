import java.util.Scanner;
//scanner 호출
public class GuGuDan {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//scanner 객체 생성
		
		System.out.println("몇 단을 출력하시겠습니까? :  ");
		int i = sc.nextInt(); // scanner를 통한 정수 입력 후 Return
		
		if(1 < i && i < 10) {
		
		for(int j = 1; j < 10; j++) {//반복문 
				System.out.printf("%d X %d = %d%n",i,j,i*j);//형식지정자
			}
		}else {
			System.out.println("2이상, 9이하의 정수를 입력하십시오");
		}
	}	
}


