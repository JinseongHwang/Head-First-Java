package study;

import java.util.ArrayList;

class Egg {
	int egg;
}

public class API_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Egg> myList = new ArrayList<Egg>();
		
		// 원소 추가 -> add
		Egg a = new Egg();
		myList.add(a);
		
		Egg b = new Egg();
		myList.add(b);
		
		Egg c = new Egg();
		myList.add(c);
		
		// 크기
		System.out.println("size: " + myList.size());
		
		// 입력한 값의 존재 유무(매핑 결과)를 반환
		System.out.println("a is in: " + myList.contains(a));
		
		// 입력한 값의 index를 반환
		System.out.println("b index: " + myList.indexOf(b));
		
		// 비어있는지 확인
		System.out.println("is empty: " + myList.isEmpty());
		
		// 입력한 값을 제거
		myList.remove(a);
		
		// 크기 재확인
		System.out.println("size: " + myList.size());
		// 존재 유무 재확인
		System.out.println("a is in: " + myList.contains(a));
		
		System.out.println("================================================");
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		
		// 0번 index부터 순차적으로 삽입
		iList.add(1);
		iList.add(2);
		iList.add(3);
		
		for (int elem : iList) {
			System.out.print(elem + " ");
		}
		System.out.println();
		
		// add에 인자를 2개 넣어주면, 
		// 앞인자 index에 뒷인자 값을 add하고, 원래 있던 값을 뒤로 밀어낸다.
		iList.add(2, 10);
		iList.add(2, 11);
		iList.add(0, 12);
		
		for (int elem : iList) {
			System.out.print(elem + " ");
		}
	}

}
