// Name: Aditya Kumar Maurya   Roll No: 2510303042   Assignment: 15   Task: 2

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
