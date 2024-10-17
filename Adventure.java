import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner choiceInput = new Scanner(System.in);
        // Questions
        boolean q1a = false;
        boolean q2a = false;

        System.out.println(
                "You have been brought by the Military to defuse a bomb. You do not know exacly where it is but there are two options. \n Option a: A-site or Option b: B-site. Where do you choose to go?");
        String question1Answer = choiceInput.nextLine();

        if (question1Answer.equals("a")) {
            q1a = true;
        }
    }
}
