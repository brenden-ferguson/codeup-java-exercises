package grades;

import java.util.ArrayList;

public class Student {

    public Student(String name, Integer grade){
        this.studentName = name;
        this.grades = new ArrayList<>();
        this.addGrade(grade);
    }

    private String studentName;

    private ArrayList<Integer> grades;

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(Integer grade : grades){
            total += grade;
        }
        return total / grades.size();
    }
}
