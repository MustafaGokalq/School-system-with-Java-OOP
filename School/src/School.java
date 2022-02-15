import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Security> securities;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;




    public School(List<Teacher> teachers, List<Student> students, List<Security> securities){
        this.teachers=teachers;
        this.students=students;
        this.securities= securities;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Student>getStudents(){
        return students;
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public List<Security>getSecurities(){
        return securities;
    }
    public void addSecurity(Security security){
        securities.add(security);
    }


    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int totalMoneySpent){
        totalMoneyEarned -= totalMoneySpent;
    }
}
