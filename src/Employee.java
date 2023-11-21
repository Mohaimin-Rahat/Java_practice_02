import java.util.Scanner;

public class Employee {

    private String first_name;
    private String last_name;
   // private  String designation;
    private String email;
     private int id;
     private float salary ;
     private float salary1;

     public String getFirst_name(){
         return first_name;
     }

    public float getSalary() {
        return salary;
    }
    public float getSalary1() {
        return salary1;
    }
    public int getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setSalary1(float salary1) {
        this.salary1 = salary1;
    }


    public static void main(String[] args) {
        System.out.println("Enter Designation:");
        Employee e= new Employee();
        e.setFirst_name("Abdul");
        e.setLast_name("Rahat");
        e.setEmail("amrahat99@gmail.com");
        //e.setDesignation("Student");
        e.setId(007);
        e.setSalary(3000);
        e.setSalary1(3400);

        Scanner s= new Scanner(System.in);
        String designation= s.next().toString();

        if (designation.equals("Manager")){
            System.out.println("ID :"+e.getId());
            System.out.println("First Name:"+e.getFirst_name());
            System.out.println("last Name:"+e.getLast_name());
            System.out.println("Email:"+e.getEmail());
            System.out.println("Salary:"+e.getSalary());
        } else if (designation.equals("Devloper")) {
            System.out.println("ID :"+e.getId());
            System.out.println("First Name:"+e.getFirst_name());
            System.out.println("last Name:"+e.getLast_name());
            System.out.println("Email:"+e.getEmail());
            System.out.println("Salary: "+e.getSalary1());
        }
        else System.out.println("Error");



       // System.out.println("Designation:"+e.getDesignation());





     }

}
