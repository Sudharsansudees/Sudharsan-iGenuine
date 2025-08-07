class Department {
    private String department;
    private String location;

    public Department(String department,String location){
        this.department=department;
        this.location=location;
    }
    public void showDepartment(){
        System.out.println("Department Name: "+department);
        System.out.println(("Location: "+location));
    }
}
class Student{
    private String name;
    private int roll;
    Department department;

    public Student(int roll, Department department){
        this.name=name;
        this.roll=roll;
        this.department=department;



    }

    public void showStudent(){

        System.out.println("Student Roll: "+ roll);
        department.showDepartment();



    }
}

public class Aggregation {
    public static void main(String[]args){
        Department d1 = new Department("CSE","Main Block");
        Department d2 = new Department("IT","First Block");



        Student s1 = new Student(121,d1);
        Student s2 = new Student(122,d2);


        s1.showStudent();
        System.out.println();
        s2.showStudent();



    }
}
