// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String CheerTo = args[0];
            CheerTo = CheerTo.toUpperCase();
            int reps = Integer.parseInt(args[1]);
            int cheerslength = CheerTo.length();
            int index = 0; 
            String an = "AaEFHILMNORSX";

                while (cheerslength > 0 ){
                        boolean check = false;
                        int anlength = an.length();
                        int index2 = 0;

                        while (anlength > 0  && check == false) {
                                if (an.charAt(index2) == CheerTo.charAt(index)){
                                        check = true;
                                } 

                                anlength--;
                                index2++;
                        }

                        if (check == true){
                                System.out.println("Give me an " + CheerTo.charAt(index) + ":" + CheerTo.charAt(index) + "!");
                        } else{
                                System.out.println("Give me a  " + CheerTo.charAt(index) + ":" + CheerTo.charAt(index) + "!");
                        }

                        cheerslength--;
                        index++;
                }  

                System.out.println("What does that spell?");
                while (reps > 0){
                        System.out.println(CheerTo + "!!!");
                        reps--;
                }
        }
}    
