package day06;

public class Method1 {
	
	public static void main(String[] args) {
		// 라면끓이기
		ramyenprocessing();
	}
	public static void ramyenprocessing()
	{
		buy();
		boll();
		put();
		eat();
	}
	public static void eat()
	{
		System.out.println("맛있게 먹는다.");
	}
	public static void put()
	{
		System.out.println("라면을 넣는다.");
	}
	public static void buy()
	{
		System.out.println("라면을 산다.");
	}
	public static void boll()
	{
		System.out.println("물을 끓인다.");
	}

}
