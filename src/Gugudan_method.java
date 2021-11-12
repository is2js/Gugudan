
public class Gugudan_method {
	// 1) x단 입력(input) -> 결과를 배열(output)로 반환해주는 메소드 구현해보기 
	// -> 배열에 결과값을 담는 부분 vs 배열에서 뽑아 출력되는 부분 2가지 중 앞의 로직 중복을 제거해준다.
	// -> 2단 , 3단 등을 times로 전달한다. -> result라는 배열에 저장한다 -> return 키워드로 반환한다.
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i + 1); 
		}
		return result;
	}
	// 4) 반환이 아니라 출력만 해주는 코드라면, main함수처럼 void예약어를 쓴다.
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		// 6강) 반복되는 부분을 메서드(input-> output)로 제거하기
		
		// 2) 1)에서 정의한 메소드를 통해, 결과값 배열을 반환받아 -> 출력용 배열에 주자.
		// -> 출력을 위해 배열변수를 선언하되,    new int[9]의 [ 빈 배열 대신 calculate(times)로 반환받은 배열] 을 건네준다.
//		for(int i=0; i < result.length; i++) {
//			result[i] = 2 * (i + 1); 
//		}
		
//		int[] result = calculate(2);
		// 3) 이제 출력하는 부분도 중복되므로 메소드로 바꿔보자. 
//		for(int i=0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		print(result);
//		
//		int[] times3 = calculate(3);
//		print(times3);
//		int[] times4 = calculate(4);
//		print(times4);
//		int[] times5 = calculate(5);
//		print(times5);
		
		// 5) 메소드는 반복되는 코드를 재활용을 통해 부피를 줄이는 것이고,  반복횟수는 똑같다. -> 
		//    반복문을 통해 [부피가 줄어든 메소드로 호출]부분들의 반복을 제거한다.
		for(int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
		

		
	}
	

}
