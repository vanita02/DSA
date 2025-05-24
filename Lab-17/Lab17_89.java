// Implement a Dictionary (key, value) pair using Hash-table. 
import java.util.*;
public class Lab17_89{
public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<String, String>();

    Scanner sc = new Scanner(System.in);

    while (true) { 
        System.out.println("Dictionary Operations : ");
        System.out.println("1. add a word (key-value pair)");
        System.out.println("2. get the meaning of word (value)");
        System.out.println("3. remove a word (key)");
        System.out.println("4. display all words in the dictionary");
        System.out.println("5. exit");
        System.out.println("choose an option : ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
            System.out.println("enter the word (key) : ");
            String word = sc.nextLine();
            System.out.println("enter the meaning (value) : ");
            String meaning = sc.nextLine();
            dictionary.put(word,meaning);
            System.out.println("ord added successfully!");
            break;

            case 2:
            System.out.println("enter the world to search : ");
            String searchWorld = sc.nextLine();
            if(dictionary.containsKey(searchWord)){
                System.out.println("the meaning of "+ searchWorld);
            }
        }
    }
}
}


