package day15;

import java.util.*;

public class Test07 {

	public Test07() {
		ArrayList vec = new ArrayList();
		
		vec.add("제니");
		vec.add('F'); // 자동 Boxing 이 되서 입력된다. char --> Character --> Object
		vec.add(27);
		vec.add(168.5);
		vec.add(false);
		
		// 자동화 처리
		for(int i = 0; i < vec.size(); i++) {
			// 데이터 꺼내고
			Object o = vec.get(i);
			// 꺼낸 데이터가 어떤 타입의 데이터인지 모르므로...
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("이름 : " + str);
			} else if(o instanceof Integer) {
				int age = (int) o;
				System.out.println("나이 : " + age);				
			} else if(o instanceof Character) {
				char gen = (char) o;
				System.out.println("성별 : " + gen);								
			} else if(o instanceof Double) {
				double height = (Double) o;
				System.out.println("신장 : " + height);												
			} else if(o instanceof Boolean) {
				boolean bool = (boolean) o;
				System.out.println("학원 : " + bool);																
			}
			
			// 이렇게 여러 형태의 데이터가 입력된 경우에는 데이터를 사용하는 시점에서는 원래 데이터로 강제형변환해서 사용해야 한다.
		}
		/*
		 	컬렉션의 특징은 여러 형태의 데이터를 동시에 보관할 수 있다는 것이다.
		 	하지만 실무에서는 이렇게 사용하는 
		 */
	}

	public static void main(String[] args) {
		new Test07();
	}

}
