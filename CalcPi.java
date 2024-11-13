// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double denominator = 1;
		double approxPi = 0;

		for(int i = 0; i < num; i++ ){

			if (i % 2 == 0){
				approxPi = approxPi + 1 / denominator;	

			} else {
				approxPi = approxPi - 1 / denominator;
			}

			denominator = denominator + 2;
		}

		approxPi = approxPi * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     "  + approxPi);
	}
}