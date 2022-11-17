import java.time.LocalDate;

public class Main {

    public static final int CURRENT_YEAR = LocalDate.now().getYear();

    public static void printIsYearLeap(int year) {
        boolean leapYear = isYearLeap(year);
        printIsYearLeapResult(year, leapYear);
    }

    private static boolean isYearLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsYearLeapResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " - year is leap");
        } else {
            System.out.println(year + " - year is not leap");
        }
    }

    public static void printApplicationVersionInstallMessage (int clientOS, int clientDeviceYear) {
        boolean unsupportedDevice = isUnsupportedDevice(clientDeviceYear);
        printApplicationVersionInstallMessageResult(clientOS, unsupportedDevice);
    }

    private static String getClientOS(int clientOS) {
        if (clientOS == 0) {
            return "iOS";
        } else if (clientOS == 1) {
            return "Android";
        }
        return "your OS";
    }

    private static boolean isUnsupportedDevice(int clientDeviceYear) {
        return clientDeviceYear < CURRENT_YEAR;
    }

    private static void printApplicationVersionInstallMessageResult (int clientOS, boolean unsupportedDevice) {
        if (unsupportedDevice) {
            System.out.println("Please install " + getClientOS(clientOS) + " lite application by link.");
        } else {
            System.out.println("Please install " + getClientOS(clientOS) + " application by link.");
        }
    }

    public static void calculateDeliveryDaysAmount(int deliveryDistance) {
        int deliveryDays = calculateDeliveryDaysAmountResult(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Delivery is not possible.");
        } else {
            System.out.println("Days for delivery: " + deliveryDays);
        }
    }

    private static int calculateDeliveryDaysAmountResult(int deliveryDistance) {
        int firstDeliveryArea = 20;
        int secondDeliveryArea = 60;
        int thirdDeliveryArea = 100;

        if (deliveryDistance <= 0 || deliveryDistance > thirdDeliveryArea) {
            return 0;
        } else if (deliveryDistance < firstDeliveryArea) {
            return 1;
        } else if (deliveryDistance < secondDeliveryArea) {
            return 2;
        } else {
            return 3;
        }
    }


    public static void main(String[] args) {
        // homework 11 started
        // task 1
        printIsYearLeap(2020);
        // another variant of checking if year is leap
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter year number to check: ");
//        int year = scanner.nextInt();
//        if (isYearLeap(year)) {
//            printIsYearLeap(year);
//        } else {
//            printIsYearLeap(year);
//        }

        // task 2
        printApplicationVersionInstallMessage(0, 2022);

        // task 3
        calculateDeliveryDaysAmount(10);
    }
}