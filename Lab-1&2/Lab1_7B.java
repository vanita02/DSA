import java.util.*;
public class Lab1_7B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for find factors:");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            if((x%i)==0){
                System.out.println("Factor= "+i);
            }
        }
    }
}
