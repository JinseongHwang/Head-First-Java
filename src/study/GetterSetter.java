package study;

class Cat {
	// private으로 선언, 인스턴스 함수로만 접근 가능토록
	private int size = 0;
	
	// getter: 저장된 값을 반환
	public int getSize() {
		return this.size;
	}
	
	// setter: 함부로 인스턴스 변수의 값이 변하지 않도록 조건을 걸 수 있다.
	public void setSize(int param) {
		if (param >= 10) {
			System.out.println("고양이의 크기가 " + param + "(으)로 설정됐어요.");
			this.size = param;
		} else {
			System.out.println("너무 작아요! 더 크게! 더 크게!");
		}
	}
	
	public void miaow() {
		System.out.println("miaow~ miaow~");
	}
}

public class GetterSetter {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		System.out.println("고양이의 크기를 5로 설정해볼게요.");
		cat.setSize(5);
		System.out.println("고양이의 크기를 30로 설정해볼게요.");
		cat.setSize(30);
		cat.miaow();
	}

}
