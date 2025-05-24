public class Lab1_12C {
    public static void main(String[] args) {
        int i=1;
        int n=0,r;
        int sum=0;
        while (i != 0) {
            i/=10;
            n++;
        }
        for(int x=1;x<=1000;x++){
            r=x%10;
            sum+=(Math.pow(r,n));
            x=x/10;

            if(x==sum){
                System.out.println(x);
            }
            else{
                x++;
            }
        }
    }
}