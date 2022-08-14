package QuizContent;
import java.util.ArrayList;
import java.util.Collections;

public abstract class Topic {

    abstract String getTopic();

    abstract ArrayList<QuestionModel> getQuestions();
}


class Python extends Topic{

    @Override
    String getTopic() {
        return "Python";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> lists = new ArrayList<>();
        String question;
        ArrayList<String> options = new ArrayList<>();

        question = "Which of the following is immutable?";
        options.add("Tuples");
        options.add("Sets");
        options.add("Lists");
        options.add("Dictionaries");

        Collections.shuffle(options);
        lists.add(new QuestionModel(question,
                new ArrayList<String>(options),
                "Tuples"));
        options.clear();

        question = "Which module is imported to use shuffle?";
        options.add("random");
        options.add("shuffle");
        options.add("collections");
        options.add("platform");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question,
                new ArrayList<String>(options),
                "random"));
        options.clear();


        question = "Which of the following cannot have repeated values?";
        options.add("set");
        options.add("list");
        options.add("tuple");
        options.add("dictionaries");
        Collections.shuffle(options);
        lists.add(new QuestionModel(question,
                new ArrayList<String>(options),
                "set"));
        options.clear();

        Collections.shuffle(lists);
        return lists;
    }
}

class Java extends Topic{

    @Override
    String getTopic() {
        return "Java";
    }

    @Override
    ArrayList<QuestionModel> getQuestions() {
        ArrayList<QuestionModel> lists = new ArrayList<>();
        String question;
        ArrayList<String> options = new ArrayList<>();

        question = "When was Java created?";
        options.add("1995");
        options.add("1969");
        options.add("1420");
        options.add("1999");
        Collections.shuffle(options);
        lists.add(new QuestionModel(
                question,
                new ArrayList<String>(options),
                "1995"));
        options.clear();

        question = "Who Developed Java?";
        options.add("Sun Microsystems");
        options.add("Jettbrains");
        options.add("Moon Microsytems");
        options.add("Mars Microsystems");
        Collections.shuffle(options);
        lists.add(new QuestionModel(
                question,
                new ArrayList<String>(options),
                "Sun Microsystems"));
        options.clear();


        question = "Who created Java?";
        options.add("James Gosling");
        options.add("James Charles");
        options.add("Jarad Higgins");
        options.add("Felix Kjelberg");
        Collections.shuffle(options);
        lists.add(new QuestionModel(
                question,
                new ArrayList<String>(options),
                "James Gosling"));
        options.clear();

        Collections.shuffle(lists);
        return lists;
    }
}
