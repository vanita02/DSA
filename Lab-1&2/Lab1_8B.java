import java.util.*;
public class Lab1_8B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int count=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
