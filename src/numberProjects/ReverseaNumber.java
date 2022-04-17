package numberProjects;


 class Parent{
	
	 
	

	public Parent() {
		
	int n=1234;
		
		
	}
	
}

public class ReverseaNumber extends Parent  {

	public ReverseaNumber() {
int num=15;
		int temp = 0;
		while (num != 0) {

			int i = num % 10;
			temp = temp * 10 + i;
			num = num / 10;

		}

		System.out.println("Reverse of a number:" + temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseaNumber rn = new ReverseaNumber();

	}

}
