// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int n = 1;
		int count = 1;
		int steps = 1;
		int reached = N;

		while (N > 0){
			System.out.print(n + " ");
			while (n != 1 || steps ==1){
				if (n % 2 == 0){
					n = n /2 ;
				} else{
					n = n * 3 + 1; 
				}
				if(mode.equals("v")){
				System.out.print(n + " ");
				}
				steps++;
			}
			if(mode.equals("v")){
			System.out.println("(" + steps + ")");
			}
			steps = 1;
			count++;
			n = count;
			N--;
		}
		System.out.println("Every one of the first " + reached + " hailstone sequences reached 1.");
	} 
}
