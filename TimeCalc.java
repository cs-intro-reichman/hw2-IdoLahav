public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; 
        int minutesToAdd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        int TotalMinutes = (hours * 60) + minutes + minutesToAdd;
        int TotalHours = TotalMinutes / 60;
        int NewHours = TotalHours % 24;
        int NewMinutes = TotalMinutes - (TotalHours * 60);

        if (NewHours < 10){
            System.out.print("0" + NewHours + ":");
        } else
        System.out.print(NewHours + ":");

        if (NewMinutes < 10){
            System.out.print("0" + NewMinutes);
        } else
        System.out.print(NewMinutes);
    }
}
