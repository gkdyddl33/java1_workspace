package day07;

public class Node
{
	private int x;
	private int y;
	
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x; // 값을 바꿔줄 때 this를 사용 
		            // x의 값을 this 의 x값으로 바꿔주겠다.
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	// 값을 초기화해주는 생성자라고 함
	public Node(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Node getCenter(Node other)
	{
		// 다른 노드를 매개변수로 받아서 원래 x,y와 other x,y를
		// 가져와서 지칭할 수 있게 하는 것
		return new Node((this.x+other.getX())/2,(this.y+other.getY())/2);
	}
}

