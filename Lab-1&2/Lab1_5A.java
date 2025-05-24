import java.util.Scanner;
public class Lab1_5A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println("Answer = "+ans);
    }
        static int fact(int n){
            if(n==1){
                return 1;
            }
            else{
                return n*fact(n-1);
            }
        }
    }