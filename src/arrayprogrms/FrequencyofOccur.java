package arrayprogrms;

public class FrequencyofOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count =0;
		int[] a = {1,1,1,2,2,3,3,3};
		int[] b=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if (a[i]==a[j]) {
					
				count++;
					
				} 
				
			}
			
			
			
		}
		
	}

}
