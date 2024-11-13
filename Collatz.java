// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
		int count = 1;
		int steps = 1;
		int reached = N;

		while (N > 0){
			System.out.print(seed + " ");
			while (seed != 1 || steps ==1){
				if (seed % 2 == 0){
					seed = seed /2 ;
				} else{
					seed = seed * 3 + 1; 
				}
				if(mode.equals("v")){
				System.out.print(seed + " ");
				}
				steps++;
			}
			if(mode.equals("v")){
			System.out.println("(" + steps + ")");
			}
			steps = 1;
			count++;
			seed = count;
			N--;
		}
		System.out.println("Every one of the first " + reached + " hailstone sequences reached 1.");
	} 
}
