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
        boolean q2aRoute2 = false;
        boolean q2bRoute2 = false;
        boolean q3aRoute1_1 = false;
        boolean q3bRoute1_1 = false;

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

        if (q1a) {
            answered = false;
            while (!answered) {
                System.out.println(
                        "You make it to bomb site A. Although on first glance you cannot find the bomb. Option a: Go to site B. Option b: Keep looking.");
                String question2answer = choiceInput.nextLine();
                if (question2answer.equalsIgnoreCase("a")) {
                    q2aRoute1 = true;
                    answered = true;
                } else if (question2answer.equalsIgnoreCase("b")) {
                    System.out.println("The bomb was not at A-site and you ran out of time! \n YOU LOSE");
                    answered = true;
                } else {
                    System.out.println("please enter valid answer");
                    answered = false;
                }
            }
        }

        if (q2aRoute1) {
            answered = false;
            while (!answered) {
                System.out.println(
                        "You make it to bomb site B. You see the bomb laying on the ground. You pull out your defuse kit and begin. Option a: Cut red wire. Option b: Cut green wire.");
                String question3aRoute1_1 = choiceInput.nextLine();
                if (question3aRoute1_1.equalsIgnoreCase("a")) {
                    System.out.println(
                            "You put go to cut the red wire and snip it. There is a spark and the bomb instantly detonates. YOU LOSE");
                    answered = true;
                } else if (question3aRoute1_1.equalsIgnoreCase("b")) {
                    q1b = true;
                    answered = true;
                } else {
                    System.out.println("please enter valid answer");
                    answered = false;
                }
            }
        }

        if (q1b) {
            answered = false;
            while (!answered) {
                System.out.println(
                        "You arrive to bomb site B. Although there is someone standing there guarding the bomb. \n Option a: Fight the terrorist. Option b: Hide.");
                String q1Route2Answer = choiceInput.nextLine();
                if (q1Route2Answer.equalsIgnoreCase("a")) {
                    System.out.println(
                            "You hide as the terrorist holds his post. After a little bit he leaves. As you walk over to defuse the bomb you realize its too late. \n YOU LOSE");
                    answered = true;
                } else if (q1Route2Answer.equalsIgnoreCase("b")) {
                    q2bRoute2 = true;
                    answered = true;
                } else {
                    System.out.println("please enter valid answer");
                    answered = false;
                }

            }
        }

    }
}
