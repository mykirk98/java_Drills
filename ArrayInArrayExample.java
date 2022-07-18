package sec02.exam06;

public class ArrayInArrayExample {
	public static void main(String[] args)
	{
		int[][] mathScores = new int[2][3];
		
		mathScores[1][2] = 10;
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<2; i++)
		{
			for(int k=0; k<3; k++)
			{
				System.out.println("englishScores[" + i + "][" + k + "] = " + englishScores[i][k]);
			}
		}
		
		System.out.println();
		
		int[][] javaScores = { {95, 80, 90}, {92, 96, 85} };
		for(int i=0; i<2; i++)
		{
			for(int k=0; k<3; k++)
			{
				System.out.println("javaScores[" + i + "][" + k + "] =  + javaScores[i][k]");
			}
		}
	}
}
