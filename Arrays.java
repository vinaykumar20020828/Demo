package Array;

import java.util.Scanner;
import java.util.ArrayList;
public class Arrays {

	public static void main(String[] args) {

//		Scanner Scan =new Scanner(System.in);
//		int[] a =new int [5];
//		int i;
//		for(i=0;i<=4;i++) 
//		{
//		System.out.println("Enter the age");
//		a[i] =Scan.nextInt();
//		}
//		System.out.println("the ages are:");
//		for(i=0;i<=4;i++) 
//		{
//			System.out.println(a[i]);
//		
//				}

//		Scanner Scan = new Scanner(System.in);
//		int[][] a = new int[2][5];
//		int i,j;
//		for (i=0; i<2; i++)
//		{
//			for (j = 0; j < 5; j++) 
//			{
//				System.out.println("class" + i +"student "+j);
//				a[i][j] = Scan.nextInt();
//			}
//			System.out.println("The ages are: ");
//		
//			for (i=0; i<2; i++) 
//			{
//				for (j = 0; j < 5; j++) {
//					System.out.print(a[i][j]+" ");
//				}
//				System.out.println();
//			}
//		System.out.println();
//		}
		Scanner Scan = new Scanner(System.in);
		int[][][] a = new int[2][3][5];
		int i, j, k;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 5; k++) {
					System.out.println("school" + i + "class" + j + "student" + k);
					a[i][j][k] = Scan.nextInt();

				}
			}
		}
       System.out.println("The age are:");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 5; k++) {
					System.out.print(a[i][j][k]+" ");

				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
//     	Scanner Scan = new Scanner(System.in);
//      int [][] a= new int[2][3];
//      a [0] =new int[3];
//      a[1] =new int[5];
//     int  i,j;
//      for(i=0;i<a.length;i++) {
//    	  for(j=0;j<a.length;j++) {
//    		  System.out.println("class"+i+"student"+j);
//    		  a[i][j]=Scan.nextInt();
//    		  
//    	  }
//      }
//	  System.out.println("The age are:");
//	  for(i=0;i<a.length;i++) {
//    	  for(j=0;j<a[i].length;j++) {
//    		  System.out.println(a[i][j]+" ");
//    		  
//    		      	  }
//    	  System.out.println();
//      }
//
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
  	}

}
