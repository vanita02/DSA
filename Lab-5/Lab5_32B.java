import java.util.*;
public class Lab5_32B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length N:");
        int N = sc.nextInt();
        String [] a = new String[N];
        for( int i=0;i<a.length;i++){
            a[i]=sc.next();
        }
        System.out.println("Random Number:");
        int m= (int)(Math.random()*(N-1));
        System.out.println("Enter word at random index:"+m);
        String s=sc.next();
        if(a[m].length()!=s.length()){
            System.out.println("Not Anagram");
        }
        else{
            char c1[]=a[m].toCharArray();
            char c2[]=s.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            
            int count=0;
            for(int i=0;i<c1.length;i++){
                if(c1[i]==c2[i]){
                    count++;
                }
                else{
                    count=0;
                }
            }
            if(count!=0){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
