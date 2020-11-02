package day03;

public class StringCasting {
	public static void main(String[] args) {
		
		String num1 ="1";
		String num2 ="2";
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2)); 
		// 문자열이 클래스 이므로 똑같이 맞춰줘야함
		// (클래스 안에는 메소드가 있으므로 정수형으롭 변환해주는 메소드를 사용)
		
		System.out.println(Double.parseDouble("1.1")+Integer.parseInt("3"));
		
		String name = "강하영";
		System.out.println("이릅:"+name);  // 변수를 값으로 볼 때는 
	}

}
