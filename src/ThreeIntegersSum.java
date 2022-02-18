//created a class 
class Triplets
{
	//created method for Finding the triplets and counting them 
	public int add()
	{
		//Defined variables
		int counter=0;
		int sum = 0;
		int arr[]= {1,2,-3,3,-1,-2,3,5,-8};
		//To get the first value of Array
		for(int i=0;i<7;i++)
		{
			//To get the consecutive 2nd value of Array
			for (int j=i+1;j<8;j++)
			{
				//To get the consecutive 3rd value of Array
				for(int k=j+1;k<7;k++)
				{
					//Logical Part
					sum =(arr[i]+arr[j]+arr[k]);
					int a = arr[i];
					int b = arr[j];
					int c = arr[k];
					if(sum == 0)
					{
						//Printing Results
						System.out.println("Array :" +sum);
						System.out.println("Array a :" +a);
						System.out.println("Array b:" +b);
						System.out.println("Array c:" +c);
						counter += 1;
						System.out.printf("Array triplets no. : " +counter);
						System.out.println();
											    
					}
				}
			}
		}
		//printing total no. of triplets
		System.out.println("Total no of Triplets in given array are =" +counter);
		return sum;
	}
}

public class ThreeIntegersSum {

	public static void main(String[] args) {
		//Object creating && Calling methods
		Triplets obj1 = new Triplets();
		obj1.add();
		

	}

}
