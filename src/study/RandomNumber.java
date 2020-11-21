package study;

public class RandomNumber {

	public static void main(String[] args) {
		int[] randomArr = new int[10];
		
		for (int i = 0; i < 10; ++i) {
			// Math.random()은 0이상 1미만의 double 값을 반환한다.
			// 0부터 100미만의 랜덤값을 얻고싶다면 아래와 같이 작성하자.
			// 1부터 100이하의 랜덤값을 얻고싶다면 1을 더해주면 된다.
			randomArr[i] = (int)(Math.random() * 100);
		}
		
		for (int val : randomArr) {
			System.out.print(val + " ");
		}
	}
}
