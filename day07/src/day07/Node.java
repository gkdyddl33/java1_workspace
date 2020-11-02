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
		this.x = x; // ���� �ٲ��� �� this�� ��� 
		            // x�� ���� this �� x������ �ٲ��ְڴ�.
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	// ���� �ʱ�ȭ���ִ� �����ڶ�� ��
	public Node(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Node getCenter(Node other)
	{
		// �ٸ� ��带 �Ű������� �޾Ƽ� ���� x,y�� other x,y��
		// �����ͼ� ��Ī�� �� �ְ� �ϴ� ��
		return new Node((this.x+other.getX())/2,(this.y+other.getY())/2);
	}
}

