import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?",
                new String[]{"Delhi", "Mumbai", "Kolkata", "Chennai"}, 0));
        questions.add(new Question("Which language runs in a web browser?",
                new String[]{"Java", "C", "Python", "JavaScript"}, 3));
        questions.add(new Question("Who is the founder of Microsoft?",
                new String[]{"Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Elon Musk"}, 1));

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.getQuestionText());
            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt() - 1;

            if (userAnswer == q.getCorrectOptionIndex()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! Correct answer is: " + options[q.getCorrectOptionIndex()]);
            }
        }

        System.out.println("\n Quiz Finished!");
        System.out.println("Your Score: " + score + " out of " + questions.size());

        scanner.close();
    }
}
