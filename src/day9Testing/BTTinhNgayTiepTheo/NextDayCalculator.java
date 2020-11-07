package day9Testing.BTTinhNgayTiepTheo;

public class NextDayCalculator {
    public static int findNextDay(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31) {
                    return 1;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    return 1;
                }
            case 2:
                if (checkYear(year)) {
                    if (day == 29) {
                        return 1;
                    } else if (day == 28) {
                        return 1;
                    }
                } else {
                    if (day == 28) {
                        return 1;
                    }
                }

        }
        return day + 1;
    }

    public static int findNextMonth(int inputDay, int inputMonth, int inputYear) {
        switch (inputMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (inputDay == 31) {
                    return inputMonth + 1;
                }
                break;
            case 12:
                if (inputDay == 31) {
                    return 1;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (inputDay == 30) {
                    return inputMonth + 1;
                }
            case 2:
                if (checkYear(inputYear)) {
                    if (inputDay == 29) {
                        return inputMonth + 1;
                    }
                } else {
                    if (inputDay == 28) {
                        return inputMonth + 1;
                    }
                }
        }
        return inputMonth;
    }

    public static int findNextYear(int inputDay, int inputMonth, int inputYear) {
        if (inputDay == 31 && inputMonth == 12) {
            inputYear = inputYear + 1;
        }
        return inputYear;
    }

    public static boolean checkYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}

