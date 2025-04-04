class SalarySuper {
    protected String name;
    protected int salary; 

    public SalarySuper(String n, int s) {
        this.name = n;
        this.salary = s;
    }


    public void getInformation() {
        System.out.println("이름 : " + name);
        System.out.println("급여 : " + salary);
    }
}

class SalarySub extends SalarySuper {
    private String department; 

    public SalarySub(String name, int salary, String department) {
        super(name, salary); 
        this.department = department;
    } 

    @Override
    public void getInformation() {
        super.getInformation(); 
        System.out.println("부서 : " + department);
    }
}

public class Workshop9 {
    public static void main(String[] args) {
        SalarySub sb = new SalarySub("오정원", 15000000, "프리렌서");
        sb.getInformation();
    }
}