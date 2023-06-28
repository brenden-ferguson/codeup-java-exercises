package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student brenden = new Student("Brenden", 85);
        Student shaine = new Student("Shaine", 92);
        System.out.println("shaine.getGradeAverage() = " + shaine.getGradeAverage());
        System.out.println("brenden.getGradeAverage() = " + brenden.getGradeAverage());
    }
}
