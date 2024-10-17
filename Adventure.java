import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner choiceInput = new Scanner(System.in);
        // Questions
        boolean gameStart = true;
        boolean q1a = false;
        boolean q1b = false;
        boolean answered = false;
        boolean q2aRoute1 = false;
        boolean q2bRoute1 = false;

        // Question 1
        if (gameStart) {
            while (!answered) {
                System.out.println(
                        "You have been brought by the Military to defuse a bomb. You do not know exacly where it is but there are two options. \n Option a: A-site or Option b: B-site. Where do you choose to go?");
                String question1Answer = choiceInput.nextLine();
                if (question1Answer.equalsIgnoreCase("a")) {
                    q1a = true;
                    answered = true;
                } else if (question1Answer.equalsIgnoreCase("b")) {
                    q1b = true;
                    answered = true;
                } else {
                    System.out.println("please enter valid answer");
                    answered = false;
                }
            }
        }

        // question 2a
        if (q1a == true) {
            answered = false;
            while (!answered) {
                System.out.println(
                        "You make it to bomb site A. Although on first glance you cannot find the bomb. Option a: Go to site B. Option b: Keep looking.");
                String question2answer = choiceInput.nextLine();
                if (question2answer.equalsIgnoreCase("a")) {
                    q2aRoute1 = true;
                    answered = true;
                } else if (question2answer.equalsIgnoreCase("b")) {
                    System.out.println("The bomb was not at B-site and you ran out of time! \n YOU LOSE");
                    answered = true;
                } else {
                    System.out.println("please enter valid answer");
                    answered = false;
                }
            }
        }

    }
}
