import java.util.Scanner;

class Employee_Details{
    int Employee_ID;
    String Name;
    String Designation;
    int Salary;
}
public static void Print(int Employee_ID,String Name,String Designation,int Salary){
    Scanner sc=new Scanner(System.in);
    Employee_ID=sc.nextInt();
    Name=sc.next();
    Designation=sc.next();
    Salary=sc.nextInt();
}
public static void PrintDetails(){
    System.out.println(Employee_ID);
    System.out.println(Name);
    System.out.println(Designation);
    System.out.println(Salary);
}
public class Lab6_34A {

    public static void main(String[] args) {
        Employee_Details employee=new Employee_Details();
        Scanner sc=new Scanner(System.in);
        Employee_ID=sc.nextInt();
        Name=sc.next();
        Designation=sc.next();
        Salary=sc.nextInt();

        void PrintDetails();
    }
}