import java.util.Scanner;

public class Gugudan {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		1강) 무식하게 출력
//		// 2단 (몇단인지 알기 위해 주석 추가)
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//		// 3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
			
//		2강) 1개 변수에 한번 담은 뒤 출력
//		// 4단 (변수에 결과값을 담아 출력 구현)
//		System.out.println("4단");
//		int result = 4 * 1; 
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
//		// 5단
//		// 5단부터는 몇단인지 입력받아 사용. -> [사용자입력]을 통해, 반복사용되면서 [바뀌는 부분만 따로 입력받는다]
//		// 사용자입력은 jdk제공 Scanner 클래스를 이용함. -> class 바깥 가장 상단에 추가한다.
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
//		// 6단부터 반복문을 사용
//		// -> 바뀌는 부분이 뒤에 똑같은 것 OR 연속되면서 반복되는 부분일 경우!
//		// 1) while문이 더쉬워서 먼저 6단 구현  2) 그담이 for로 7단 구현
//		// 1-1) while문의 시작점을 정한다. -> 1부터 9까지 반복되므로 시작점은 1이다. 
//		int i = 1;
//		// 1-2) 언제까지??? 1시작이면 ->   while < N+1 or <= N 까지가.. N번임. (0시작  while < N or 1시작  while  < N+1)
//		while(i < 10) {
//			System.out.println(6 * i); // 반복되는(연속되는) 부분을 반복문 & i 통해 해결한다.
//			i = i + 1; // my) while검사 값의 업데이트는 맨 마지막에 해주는게 좋음. // i++로 줄여서 쓸 수 있다.
//		}
//		
//		// 7단: while문의 추상화. while문보다 더 line수를 줄인 것
//		// - 대부분은 while보다는 for문을 써서 짧게 간다.
//		int LAST_NUM = 9;
//		for(int j = 1; j < LAST_NUM + 1; j++) {
//			System.out.println(7 * j);
//		}
//		
		
		
		// 사용자입력에 따라 8, 9단 구현
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		// + 사용자 입력값을 한번찍어보자.
		System.out.println("사용자가 입력한 값 : " + number); // 문자열 + 숫자가 가능하다.
		
		// 사용자 입력값을 담은 변수를 통해 -> 조건을 건다. if   else if   else 
		if (number < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if (number > 9) {
			System.out.println("값을 잘못 입력했습니다.");			
		} else {
			// for문으로 구구단을 연속된 부분을 처리하여 출력 
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);			
			}
		}
		
	}
}

