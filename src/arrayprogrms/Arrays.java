package arrayprogrms;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array declaration, Instantiation, Initialization

		int[] a = new int[1];
		int[] b;
		a[0] = 15;
		System.out.println(a[0]);

		int[] c = { 1, 2, 3, 4, 5, 6 };

		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f' };

		String[] ar = { "siva", "Narayana" };
		String ba = ar[0];
		System.out.println(ba.charAt(1));
		for (String s : ar) {

			System.out.println(s);
		}
		for (char j : ch) {

			System.out.print(j);
		}

		for (int i : c) {
			System.out.print(i);
		}

		int[][] arr = new int[1][1];
		arr[0][0] = 15;
		System.out.println(arr[0][0]);
		int[][] array = { { 1,2,3,4 }, { 5,6,7,8} };
		
		System.out.println(array.length);
		System.out.println(array[0][1]);
		
		for(int m=0;m<array.length;m++)
		{
			//int[] o=array
			for(int n=0;n<array[m].length;n++) {
				
				System.out.println(array[m][n]);
				
				
			}
			
		}
	}

}
