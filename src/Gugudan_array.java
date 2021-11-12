
public class Gugudan_array {
	public static void main(String[] args) {
		// 4강) 반복문동안 결과값마다 출력하지않고, 결과값 여러개를 배열에 저장해둔 다음, ---추후에---> 출력시 배열에서 꺼내서 하기
		
		// 1) 사용자 입력을 받아  반복계산의 결과값을 배열에 저장
		// 배열만드는 방법: 1) 배열표시 -> 변수이름 -> new 배열크기 지정 
		int[] result = new int[9];
		// 반복문에 0시작, < result.length ( < N)통해 배열index를 돌며 사용한다. 
		for(int i=0; i < result.length; i++) {
			// 2단인데, 2는 사용자입력 받을 예정 ->  배열index(0~, 총9개) + 연속되는 숫자처리(1~9)만.. 반복됨.. 2는 나중에 입력 받을 것임.
			result[i] = 2 * (i + 1); // 배열은 0부터 -> i=0부터 돌리는데,   추가로 필요한 연속된수는  1부터 -> i을 이용해서 만들어준다.
		}
			
		// 2) 배열에서 반복문으로 꺼내기
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
//		//3) 3단을 복붙해서 구현해보기
//		//int[] result = new int[9];
//		result = new int[9]; // 같은변수를 다시 초기화시에는 type빼고 빈값을 할당해줘야한다.
//		for(int i=0; i < result.length; i++) {
//			result[i] = 3 * (i + 1); // 2 -> 3 단으로 바뀜.
//		}
//		for(int i=0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		// 4) 다른 배열을 사용해보기 
//		int[] times3 = new int[9];
//		for(int i=0; i < times3.length; i++) {
//			times3[i] = 3 * (i + 1); 
//		}
//		for(int i=0; i < times3.length; i++) {
//			System.out.println(times3[i]);
//		}
		
		// 5) 바뀌는 부분은 2단, 3단 등 사용자 입력받을 부분만 달라진다. 나머지는 중복된다. 
		// -> 2중 for문을 만들어서 코드 단순 반복을 없앤다. -> 다음에는 메소드/함수를 만들어서 중복을 제거할 수도 있다(다음시간)
		
		// my) 
		for(int j=2; j < 10;j++) {
			int[] res = new int[9];
			for(int i=0; i < res.length; i++) {
				res[i] = j * (i + 1);
			}
			
			System.out.println(j+"단 입니다.");
			
			for(int i=0; i < res.length; i++) {
				
				System.out.println(res[i]);
			}
		}
		
	}
}

