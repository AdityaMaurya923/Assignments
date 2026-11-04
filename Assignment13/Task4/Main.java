// Name: Aditya Kumar Maurya   Roll No: 2510303042   Assignment: 13   Task: 4

public class Main {
    public static void main(String[] args) {
        String word = "abc";

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}
