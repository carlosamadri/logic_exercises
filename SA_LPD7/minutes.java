package SA_LPD7;

import java.util.Scanner;

public class minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days;
        int hours;
        int minutes;

        do {
            System.out.print("Enter one day from Monday to Friday:");
            days = scanner.nextLine();

            if (!validDay(days)) {
                System.out.println("The day entered is not valid, Re-enter the day, please.");
                continue;
            }

            System.out.print("Enter the time in 24-hour format:");
            hours = scanner.nextInt();

            if (hours < 0 || hours > 23) {
                System.out.println("The value entered is not valid. Try again, please.");
                scanner.nextLine();
                continue;
            }

            System.out.print("Enter the minutes:");
            minutes = scanner.nextInt();

            if (minutes < 0 || minutes > 59) {
                System.out.println("The value entered is not valid. Try again, please.");
                scanner.nextLine();
                continue;
            }
            break;
        } while (true);

        int minutesTilWeekend = minutesTilWeekend(days, hours, minutes);
        System.out.println("Minutes to go until the weekend: " + minutesTilWeekend);
    }
    private static boolean validDay(String days) {
        return days.equals("monday") || days.equals("tuesday") || days.equals("wednesday") || days.equals("thursday") || days.equals("friday");
    }
    private static int minutesTilWeekend(String days, int hours, int minutes) {
        int totalMinutes = 0;

        switch (days) {
            case "monday":
                totalMinutes = (4*24*60) + (15*60) - (hours * 60 + minutes);
                break;
            case "tuesday":
            case "wednesday":
            case "thursday":
                totalMinutes = ((4 - dayOfWeek(days)) *24*60);
                break;
            case "friday":
                if (hours < 15) {
                    totalMinutes = (15*60) - (hours * 60 + minutes);
                }
                break;
        }
        return totalMinutes;
    }
    private static int dayOfWeek(String days) {
        switch (days) {
            case "monday":
                return 1;
            case "tuesday":
                return 2;
            case "wednesday":
                return 3;
            case "thursday":
                return 4;
            default:
                return 0;
        }
    }
}
