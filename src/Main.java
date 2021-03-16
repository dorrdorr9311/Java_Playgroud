


import java.lang.Math;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // 변수 생성 및 주사위 던지기
    
    
    // 결과 출력
    int[] arr = new int[11];
    for(int i = 0; i < 100; i++){
    	
    	int a = DieA.roll();
        int b = DieB.roll();
        
        arr[a+b-2] ++;
    }
    for(int i = 0; i < 11; i++ ){
      System.out.printf("%s => ", i+2);
      for(int j = 0; j < arr[i]; j++){
        System.out.printf("#");  
      }
      System.out.println();
    }
    
  } 
}

class DieA {
  // 1 부터 6사이 정수를 반환 [참고] https://cloudstudying.kr/challenges/348
  public static int roll() {
    double r = Math.random() * 6; // 0.0 <= r < 6.0
    int randInt = (int) r;        // 0, 1, 2, ..., 5
    return randInt + 1;           // 1, 2, 3, ..., 6
  }
}

class DieB {
  public static int roll() {
    // 1 부터 6사이 정수를 반환 [참고] https://cloudstudying.kr/challenges/404
    Random rand = new Random();
    int randInt = rand.nextInt(6); // (0 ~ 5)
    return randInt + 1;
  }
}