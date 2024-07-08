import java.util.ArrayList;

public class StudentGrade {
    private  String name;
    private ArrayList<String> subject;
    private ArrayList<Character> grade;

   public StudentGrade(String n) {
       name = n;
       subject = new ArrayList<>();
       grade = new ArrayList<>();// initialize grade Arraylist

}

    public String getName() {
        return name;
    }

    public void add(String s, Character g){
       subject.add(s);
       grade.add(g);

    }

    public ArrayList<String> getSubject() {
        return subject;
    }
    public double getGPA(){
       double totalPoints = 0.0;
       for(char g: grade){
           switch (g){
               case 'A':
                   totalPoints += 4.0; //Use +- for accumulation
                   break;
               case 'B':
                   totalPoints += 3.0; //Use +- for accumulation
                   break;
               case 'C':
                   totalPoints += 2.0; //Use +- for accumulation
                   break;
               case 'D':
                   totalPoints += 1.0; //Use +- for accumulation
                   break;
               case 'F':
                   totalPoints += 0.0; //Use +- for accumulation
                   break;
           }
       }
       return totalPoints / grade.size();
    }
}
