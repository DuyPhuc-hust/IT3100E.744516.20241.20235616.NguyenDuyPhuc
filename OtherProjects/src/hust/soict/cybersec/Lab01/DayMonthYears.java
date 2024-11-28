import javax.swing.JOptionPane;

public class DayMonthYears {
    public static void main(String[] args) {
        while (true) {
            String monthInput = JOptionPane.showInputDialog(null, "Enter the month (name, abbreviation, 3 letters, or number):", "Month Input", JOptionPane.QUESTION_MESSAGE);
            String yearInput = JOptionPane.showInputDialog(null, "Enter the year (non-negative number):", "Year Input", JOptionPane.QUESTION_MESSAGE);
            int month = parseMonth(monthInput);
            int year = parseYear(yearInput);
            if (month == -1 || year == -1) {
                JOptionPane.showMessageDialog(null, "Invalid month or year.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            int days = getDaysInMonth(month, year);
            String monthName = getMonthName(month);
            JOptionPane.showMessageDialog(null, monthName + " " + year + " has " + days + " days.", "Result", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }
    private static int parseMonth(String monthInput) {
        monthInput = monthInput.toLowerCase();
        switch (monthInput) {
            case "january":
            case "jan":
            case "jan.":
            case "1":
                return 1;
            case "february":
            case "feb":
            case "feb.":
            case "2":
                return 2;
            case "march":
            case "mar":
            case "mar.":
            case "3":
                return 3;
            case "april":
            case "apr":
            case "apr.":
            case "4":
                return 4;
            case "may":
            case "may.":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug":
            case "aug.":
            case "8":
                return 8;
            case "september":
            case "sep":
            case "sept":
            case "sept.":
            case "9":
                return 9;
            case "october":
            case "oct":
            case "oct.":
            case "10":
                return 10;
            case "november":
            case "nov":
            case "nov.":
            case "11":
                return 11;
            case "december":
            case "dec":
            case "dec.":
            case "12":
                return 12;
            default:
                return -1;
        }
    }
    private static int parseYear(String yearInput) {
        try {
            int year = Integer.parseInt(yearInput);
            if (year >= 0) {
                return year;
            }
        } catch (NumberFormatException e) {
        }
        return -1;
    }
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    private static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }
}