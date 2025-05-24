import java.util.*;
public class Lab1_11C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();

        int sum=0;
        int innerSum=0;

        for(int i=1;i<=n;i++){
            innerSum += i;
            sum += innerSum;
        }
        System.out.println("Sum= "+sum);
    }
}
