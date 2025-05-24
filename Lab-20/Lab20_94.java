import java.util.*;

class Selection{
    Scanner sc = new Scanner(System.in);
    public void selectionSort(){
        System.out.println("enter arrary size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter array element : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        System.out.println("sorted array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class Lab20_94{
    public static void main(String[] args) {
        Selection s = new Selection();
        s.selectionSort();
    }
}