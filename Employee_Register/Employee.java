package Employee_Register;

public class Employee extends Person{
    private String Department;
    static int EmployeeCount;
    int count;

    public Employee(String Name,int Id, String Department){
        super(Name,Id);
        count=EmployeeCount++;
        this.Department=Department;


    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public static void showEmployeeCount(){
        System.out.println("Total Employee Count: "+EmployeeCount);
    }

    public void showDetails(){
        System.out.println("\nEmployee Details:");
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getId());
        System.out.println("Department : "+getDepartment());
    }

}
