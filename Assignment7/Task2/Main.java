// Name: Aditya Kumar Maurya   Roll No: 2510303042   Assignment: 7   Task: 2

public class Main {
    public static void main(String[] args) {
        int steps = 0;

        // Time complexity: O(n^2) - the inner loop runs n times for each of the n outer iterations
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                steps++;
            }
        }

        System.out.println("Steps: " + steps);
    }
}
