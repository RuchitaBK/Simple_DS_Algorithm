import java.util.*;
public class InitateSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		Basic_algorithm b1=new Basic_algorithm();
		System.out.println("Which SOrting you want perform ");
		System.out.println("\n 1.Bubble Sort \n 2.insertion sort \n 3. Merge Sort ");
		int choice =scan.nextInt();
		switch(choice)
		{
		case 1: 
			   b1.bubblesort();
			   break;
		case 2:
			b1.insertionsort();
			 break;
		case 3: 
			b1.selectionsort();
			break;
		}

		
	}

}
