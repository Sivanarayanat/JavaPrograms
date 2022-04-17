package numberProjects;

public class Peterson {

	public void peterson(int num) {
		int temp = num;
		int pet = 0;
		int fact = 1;
		while (num != 0) {
			int j = num % 10;

			for (int i = 1; i <= j; i++) {
				fact = fact * i;

			}
			System.out.println(fact);
			pet = pet + fact;
			fact=0;
			System.out.println(pet);
			num = num / 10;
			System.out.println(num);
		}

		if (pet == temp) {

			System.out.println("it is peterson");
		} else {

			System.out.println("It is not peterson");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peterson p= new Peterson();
		p.peterson(145);
		
		
		
	}

}
