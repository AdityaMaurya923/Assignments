// Name: Aditya Kumar Maurya   Roll No: 2510303042   Assignment: 2   Task: 3

public class Main {
    public static void main(String[] args) {
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
