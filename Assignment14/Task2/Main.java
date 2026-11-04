// Name: Aditya Kumar Maurya   Roll No: 2510303042   Assignment: 14   Task: 2

public class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}
