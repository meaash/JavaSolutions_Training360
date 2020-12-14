package records;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        if(isEmpty(name)){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){
        if (mark != null){
            marks.add(mark);}
            else {
        throw new NullPointerException("Mark must not be null!");
    }
    } // érdemjegy rögzítése
    public double calculateAverage(){
      //  if(marks!= null && !marks.isEmpty()){
        double sum = 0.0;
        for (Mark mark: marks) {
          sum +=  mark.getMarkType().getValue();
        }
        double avg = sum/marks.size();
        return Math.round(avg*100.0)/100.0;
       // }
      //  else{
      //      throw new ArithmeticException("No marks present, average calculation aborted!");
      //  }

    } // teljes átlag számolása
    public double calculateSubjectAverage(Subject subject){
        double sum = 0.0;
        if(marks!= null && !marks.isEmpty() && hasMarkFromSubject(subject)){
        int count = 0;
        for (Mark mark: marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())){
            sum +=  mark.getMarkType().getValue();
            count ++;
            }
        }
        return sum/count;
        }

        return sum;
    } // tantárgyhoz tartozó átlag számítása

    private boolean isEmpty(String str){
        return (str == null || str.isEmpty())? true : false;
    }

    private boolean hasMarkFromSubject(Subject subject){
        return marks
                .stream()
                .anyMatch(s -> s.getSubject().getSubjectName().contains(subject.getSubjectName()));
    }

   private String marksToString(){
        StringBuilder sb = new StringBuilder();
        for (Mark mark : marks) {
            sb.append(mark.getSubject().getSubjectName() + ": " + mark);
        }
        return  sb.toString();
    }

    @Override
    public String toString() {
        return name +
                " marks: " + marksToString();
    }

    // diák szöveges reprezentációja

}
