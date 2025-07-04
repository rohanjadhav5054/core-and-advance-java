package Quiz_Project;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "1.Which Language is Enterprise Market ?", "Java", "C++", "C", "Python", "Java");
        questions[1] = new Question(2, "2.Which language is used in Android development ?", "Java", "C++", "C", "Python", "Java");
        questions[2] = new Question(3, "3.Which language is mostly used in industry ?", "Java", "C++", "C", "Python", "Java");
        questions[3] = new Question(4, "3.Which Language is Enterprise Market ?", "Java", "C++", "C", "Python", "Java");
        questions[4] = new Question(5, "4.Which Language is Enterprise Market ?", "Java", "C++", "C", "Python", "Java");

    }
    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println("Q no : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1 "+q.getOption1());
            System.out.println("2 "+q.getOption2());
            System.out.println("3 "+q.getOption3());
            System.out.println("4 "+q.getOption4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i = 0;i<questions.length;i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer =selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }

        System.out.println("Your Score is : "+score);
    }
}
