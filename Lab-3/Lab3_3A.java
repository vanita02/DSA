import java.util.*;
public class Lab3_3A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        double n=sc.nextDouble();
        double sum=0;
        double avg;

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum= "+sum);

        avg=sum/n;
        System.out.println("Average:"+avg);
    }
}