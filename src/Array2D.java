import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) 
	{
		//Initializing the length of 2D array and inerting the elements
		Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the no. of rows less than 5 :");
     	int M =scanner.nextInt();
     	System.out.println("Enter the no. of coloumns less than 7 :");
     	int N =scanner.nextInt();
     	int arr[][] = {
     					{1,2,3,4,5,6},
     				    {7,8,9,10,11,12},
     				    {13,14,15,16,17,18},
     				    {19,20,21,22,23,24}
     				   };
     	//Logics for printing 2D-Array
     	for(int i=0;i<M;i++)
     	{
     		for(int j=0;j<N;j++)
     		{
     			System.out.print(" "+ arr[i][j]);
     		}
     			System.out.println();
     	}
	}

}
