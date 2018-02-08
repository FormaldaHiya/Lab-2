public class Problem2{
		int n = 1037;
		System.out.println("Starting number is " + n);
		for (int i=0; n>1; i++){
			if (n%2==0){
				n=n/2;
				System.out.println(n);
			}
			else {
				n=n*3+1;
				System.out.println(n);
		}}
		System.out.println("Number of attempts: " + i);
		}