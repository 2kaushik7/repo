package toolClasses;
/*represnting printing data*/
public class TestClass {
	
	
	
	public static void main(String[] args)
	{
		int sum[] ={-1,4,0,3};
		ToolClass tc = new ToolClass();
		tc.test();
		
		System.out.println("tool tested");
		
		for(int i : sum)
		{
		System.out.println("tool tested " +sum[i]+ " times");
		}
		
	}

}
