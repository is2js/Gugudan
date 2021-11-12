
public class Gugudan_class {
	// 1만줄을.. 1개 클래스 - 1개 메인에서 다 호출x
	// 새로운 class생성 - 내부에 메소드or함수들 통해 기능을 분리함.  -> class들의 묶음 : 1개 package
	// 여기서는 public class [구구단_method]에 정의한 메소드들 2개를 그대로두고 -> 
	// 함수를 실행시키는 main메소드를 별도의 class로 분리한 다음,  구구단class를 호출해서 실행시킨다.
	
	// 1. main실행용 class 생성 -> 원래는 [ GugudanMain ] -> GugudanMain.java 상태임.
	// 2. 기존 class에 뭉쳐져있떤 main메소드를 잘라내서 가져오기
	// -> main에서 호출하던 method들에 빨간줄이 뜬다.
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			// 3. 같은 선상에 있는 java파일인 class를 앞에 적어주기만 하면 된다(따로 import안해도된다!!) 
			//int[] result = calculate(i);
			int[] result = Gugudan_method.calculate(i);
			Gugudan_method.print(result);
		}
	}
	
}
