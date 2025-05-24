import java.util.*;

class Student_Details{
    int Enrollment_No;
    String Name;
    int Semester;
    double CPI;
}
/**
 * Lab6_35A
 */
public class Lab6_35A {
    public static void main(String[] args) {
        Student_Details stu[]=new Student_Details[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<stu.length;i++){
            stu[i].Enrollment_No=sc.nextInt();
            stu[i].Name=sc.next();
            stu[i].Semester=sc.nextInt();
            stu[i].CPI=sc.nextInt(); 
        }
        for(int i=0;i<stu.length;i++){
           System.out.println(stu[i].Enrollment_No); 
           System.out.println(stu[i].Name);
           System.out.println(stu[i].Semester);
           System.out.println(stu[i].CPI);
        }
    }
}