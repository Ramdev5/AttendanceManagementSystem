import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Create a GregorianCalendar object for the specified year and month
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);

        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("\nCalendar for " + month + "/" + year);

        // Print days of the week headers
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first day
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);

            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println();
    }
}
