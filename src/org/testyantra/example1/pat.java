package org.testyantra.example1;

public class pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1;
		for(int i=1;i<=5;i++)
		{
			//spaces
			
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			//display
			
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("* ");
				
				
			}
			System.out.println();
		}

	}

}
