package projecteleven;

public class Main {
	public static void main(String[] args)	{
		StackMin s = new StackMin();
	
		s.push(3);
		s.push(5);
		s.getMin();
		s.push(2);
		s.push(1);
		s.getMin();
		s.pop();
		s.getMin();
		s.pop();
	}
}