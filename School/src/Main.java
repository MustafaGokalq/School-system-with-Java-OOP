import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Teacher ela = new Teacher(1," Ela",1000);
        Teacher mehmet = new Teacher(2,"Mehmet",1200);
        Teacher kerim = new Teacher(3,"Kerim",1500);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ela);
        teacherList.add(mehmet);
        teacherList.add(kerim);

        Student can = new Student(1,"can",4);
        Student ali = new Student(2,"Ali",10);
        Student rauf = new Student(3," Rauf ",8);
        List<Student> studentList = new ArrayList<>();
        studentList.add(can);
        studentList.add(ali);
        studentList.add(rauf);


        Security refik = new Security(1,"Refik",600);
        Security halit = new Security(2,"Halit",600);
        List<Security> securityList = new ArrayList<>();
        securityList.add(refik);
        securityList.add(halit);






        School ghs = new School(teacherList,studentList,securityList);

        Teacher suzan = new Teacher(6,"Suzan",900);

        ghs.addTeacher(suzan);


        can.payFess(5000);
        ali.payFess(6000);
        System.out.println("Ghs kazanılan $"+ ghs.getTotalMoneyEarned());

        ela.receiveSalary(ela.getSalary());
        System.out.println("Ghs ödenen maaş"+ ela.getName()
                +" şimdiki $"+ ghs.getTotalMoneyEarned());

        refik.receiveSalary(refik.getSalary());
        System.out.println(refik);

        System.out.println(rauf);

        mehmet.receiveSalary(mehmet.getSalary());

        System.out.println(mehmet);

        refik.receiveSalary(refik.getSalary());

        System.out.println("Kasada kalan para $"+ghs.getTotalMoneyEarned());




    }

}
