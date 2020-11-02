package day08;

public class Refrence {
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
			this.x = x;
		}
		public int getY()
		{
			return y;
		}
		public void setY(int y)
		{
			this.y = y;
		}
		public Node(int x,int y)
		{
			this.x = x;
			this.y = y;
		}
		public Node getCenter(Node other)
		{
			return new Node((this.x+other.getX())/2,(this.y+other.getY())/2);
		}
	}
	public static void main(String[] args) {
		Node one = new Node(10,20);
		Node two = new Node(30,40);
		Node result = one.getCenter(two);
		System.out.println("x:"+result.getX()+",y:"+result.getY());
	}

}
