    import java.util.*;

    public class Student {
        public static void main(String[] args) {
            SortedMap <String,StudentMarks>students=new TreeMap<>();

            SortedSet<StudentMarks> TopThree = new TreeSet<>(new Comparator<StudentMarks>() {
                public int compare(StudentMarks s1, StudentMarks s2) {
                    return Double.compare(s2.getaverage(), s1.getaverage());
                }
            });
            StudentMarks bob=new StudentMarks(105,"Bob");
            bob.addsubjecmarks("Math",89);
            bob.addsubjecmarks("Science",92);
            bob.addsubjecmarks("History",88);
            students.put("bob",bob);
            TopThree.add(bob);
            StudentMarks alice=new StudentMarks(102,"Alice");
            alice.addsubjecmarks("Math",95);
            alice.addsubjecmarks("science",87);
            alice.addsubjecmarks("History",91);
            students.put("alice",alice);
            TopThree.add(alice);
            StudentMarks eve=new StudentMarks(120,"Eve");
            eve.addsubjecmarks("Math",96);
            eve.addsubjecmarks("Science",88);
            eve.addsubjecmarks("History",92);
            students.put("eve",eve);
            TopThree.add(eve);
            StudentMarks carol=new StudentMarks(110,"Carol");
            carol.addsubjecmarks("Math",94);
            carol.addsubjecmarks("Science",85);
            carol.addsubjecmarks("History",90);
            students.put("carol",carol);
            TopThree.add(carol);
            StudentMarks david=new StudentMarks(115,"David");
            david.addsubjecmarks("Math",88);
            david.addsubjecmarks("Science",91);
            david.addsubjecmarks("History",84);
            students.put("david",david);
            TopThree.add(david);

            Iterator displaystudentname=students.values().iterator();
            System.out.println("Student Records: ");
            System.out.println("-----------------");
            while (displaystudentname.hasNext()){
                System.out.println(displaystudentname.next());
            }
            System.out.println("Top Performing Students");
            System.out.println("-------------------------");

            int count = 0;
            for (StudentMarks student : TopThree) {
                System.out.println(count + 1 + ". Student ID: " + student.getId() + " Name: " + student.getName() + " Average Score: " + student.getaverage());
                count++;
                if (count >= 3) {
                    break;
                }
            }
        }
    }
