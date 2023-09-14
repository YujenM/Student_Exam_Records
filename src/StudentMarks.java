
import java.util.HashMap;
public class StudentMarks {
    private int id;
    private String name;
    private HashMap<String, Integer> SubjectMarks;

    public StudentMarks(int id, String name) {
        this.id = id;
        this.name = name;
        this.SubjectMarks = new HashMap<>();
    }

    public void addsubjecmarks(String subject, int Score) {
        SubjectMarks.put(subject, Score);
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public double getaverage() {
        int totalmarks = 0;
        for (int total : SubjectMarks.values()) {
            totalmarks += total;
        }

        return (double) totalmarks/SubjectMarks.size();
    }

    public String toString(){

        return  "Student ID: " +id+ " Name: "+ name+ " Scores: " + SubjectMarks;
    }


}
