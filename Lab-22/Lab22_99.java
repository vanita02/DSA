import java.util.*;

public class Lab22_99 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        shellSort();
    }

    public static void shellSort(){
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int gap=n/2; gap>=1; gap=gap/2){
            for(int j=gap; j<n; j++){
                for(int i=j-gap; i>=0; i=i-gap){
                    if(arr[i+gap] > arr[i]){
                        break;
                    } else{
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
