public class Student {
    private int  id;
    private String name;
    private int grade;
    private int fessPaid;
    private int fessTotal;

    public Student(int id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.fessPaid=0;
        this.fessTotal=30000;
    }




    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }






    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }






    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }





    public int getFessPaid(){
        return fessPaid;
    }
    public void setFessPaid(int fessPaid){
        this.fessPaid = fessPaid;
    }


    public void payFess(int fess){
        fessPaid += fess;
        School.updateTotalMoneyEarned(fessPaid);
    }





    public int getFessTotal(){
        return fessTotal;
    }





    public void setFessTotal(int fessTotal){
        this.fessTotal += fessPaid;
    }







    public int getRemainingFess() {
        return fessTotal - fessPaid;
    }


    public String toString(){
        return "Ögrenci Adı"+name+
                "Toplam ödenen para $"+fessPaid;
    }
}
