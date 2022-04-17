package numberProjects;

public class Automorphic {

	public void squar(int num) {
		int count = 0;
		int temp = num;
		int amp = 0;
		int ap = 0;
		int sq = num * num;
		while (num != 0) {

			num = num / 10;
			count++;
		}
		System.out.println(count);

		for (int i = 1; i <= count; i++) {
			int j = sq % 10;
			amp = amp * 10 + j;
			sq = sq / 10;

		}
		for (int i = 1; i <= count; i++) {
			int k = amp % 10;
			ap = ap * 10 + k;
			amp = amp / 10;
		}
		System.out.println(amp);
		if (ap == temp) {

			System.out.println("it is amp");
		}

		else {

			System.out.println("It is not an amp");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// automorphic means square of number should contain the number ex: 25= 625
		Automorphic a = new Automorphic();
		a.squar(3);

	}

}
