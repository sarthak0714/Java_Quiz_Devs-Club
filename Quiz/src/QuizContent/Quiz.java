package QuizContent;
import java.util.*;
public class Quiz{
    int correct;
    int incorrect;
    Results results;

    public Quiz() {
        correct = 0;
        incorrect = 0;
        results = new Results() {
            @Override
            public void onCorrect() {
                System.out.println("Correct ! ");
                correct++;
            }


            @Override
            public void onIncorrect(String answer) {
                System.out.println("Incorrect!\n"
                        + "The correct option was: "+answer);
                incorrect++;
            }
        };
    }


    public void start() {
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new Python());
        topics.add(new Java());
        int chosenTopic = 0;

        while(chosenTopic != 2){
            Scanner o = new Scanner(System.in);
            System.out.println("Select a Tpoic:\n"
                    + "0 for Python\n"
                    + "1 for Java\n"
                    + "2 for exit");

            chosenTopic = o.nextInt();

            if(chosenTopic != 2){
                Topic selected = topics.get(chosenTopic);

                Scanner sc = new Scanner(System.in);
                ArrayList<QuestionModel> topicQuestions = selected.getQuestions();

                for (int i = 0; i < topicQuestions.size(); i++) {
                    QuestionModel question = topicQuestions.get(i);
                    System.out.println("------------------");
                    System.out.println(question.getQuestion());


                    for (int j = 0; j < question.getOption().size(); j++)
                        System.out.println(j + ". "+question.getOption().get(j));

                    System.out.print("Your Answer:");
                    int select = sc.nextInt();
                    String selected_answer = question.getOption().get(select);

                    checkAnswer(question, selected_answer);
                }
                System.out.println("----------------------------------");
                System.out.println(correct + " Correct\n"
                        + incorrect + " Incorrect\n"
                        + "Score = "+ correct
                        + "/" + topicQuestions.size()
                );
                System.out.println("----------------------------------");
            }
            else{
                System.out.println("Thank You ");
            }
            correct = 0;
            incorrect = 0;
        }

    }
    public void checkAnswer(QuestionModel model,String sel){
        String answer = model.getAnswer();
        if(answer.equalsIgnoreCase(sel))
            results.onCorrect();
        else
            results.onIncorrect(model.getAnswer());
    }
}
