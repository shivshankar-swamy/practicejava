import java.util.Scanner;
public class ArrayFrqn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int count=0;
        System.out.println("enter the array element");
        int n=sc.nextInt();
        for(int i=0;i<8;i++){
            if(n==arr[i]){
                count++;
            }
        }
        System.out.println("element= "+n+" repeats "+count+" times");
        sc.close();
    }
}
