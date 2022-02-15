public class Security {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Security(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
    public String toString(){
        return "Güvenlik adı: " + name
                + "Toplam kazanılan para $"
                + salaryEarned;
    }
}
