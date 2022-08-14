package QuizContent;
import java.util.ArrayList;
import java.util.Map;

public class QuestionModel {
    String question;
    ArrayList<String> options;
    String answer;

    public QuestionModel(String question,ArrayList<String> options,String answer){

        this.question=question;
        this.options=options;
        this.answer=answer;

    }

    public String getQuestion(){return question;}

    public void setQuestion(String question){this.question=question;}

    public ArrayList<String> getOption() {
        return options;
    }

    public void setOptions(ArrayList<String> option){this.options=option;}

    public String getAnswer() {return answer;}

    public void setAnswer(int String){this.answer = answer;}
}

