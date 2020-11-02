package day06;

public class LastPractice {
	public static void main(String[] args) {
		// 리얼 격투게임
		
		// 두 영웅 객체를 생성
		Hero arthas = new Hero("아서스");
		Hero leona = new Hero("레오나");
		
		// 격투시작
		Hero.battle(arthas,leona);
	}
}
class Hero
{
	// 필드정의
	String name;
	int hp = 30;
	
	// 생성자정의
	Hero(String name)
	{
		this.name = name;
	}
	
	// 클래스의 펀치 메소드 정의
	void punch(Hero enemy)
	{
		enemy.hp -= 10;
		System.out.printf("[%s]의 펀치\n",this.name);
		System.out.printf("[\t%s] : %d\n",enemy.name,enemy.hp);
	}
	
	// static메소드 battle 정의
	static void battle(Hero a, Hero b)
	{
		// 두 명이 모두 체력이 남아있다면, 계속 싸움을 진행
		while(a.hp > 0 && b.hp > 0) // 두 명이 체력이 남아있다
		{
			// 1/2학생로 공격/수비 결정
			Hero attacker , defender;
			if(Math.random() < 0.5)
			{
				attacker = a;
				defender = b;
			}
			else
			{
				attacker = b;
				defender = a;
			}
			
			// 대상을 공격
			attacker.punch(defender);
		}
	}
}
