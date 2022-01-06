import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Runner {

    public static void main(String[] args) {

        HashMap<String, Integer> exams = new HashMap<>();
        exams.put("physics", 80);
        exams.put("chemistry", 150);
        exams.put("biology", 50);
        exams.put("maths", 150);

        Student student001 = new Student("Don");
        student001.putExams(exams);
        Results finalExam = new Results(student001);
        finalExam.displayResults("Don");

    }
}







