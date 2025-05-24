import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        sc.close();

        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
