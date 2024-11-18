import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the number of element to store");
        int n=sc.nextInt();
        int[] arr=new int[n];


        if(size>=n) {

            System.out.println("enter the arrray elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("the elments of array is :");
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }

            System.out.println("enter the key element");
            int key=sc.nextInt();
            int count=1;
            for(int i=0;i<n;i++){
                if(key==arr[i])
                {
                    System.out.println(i);
                }
                count++;
        }

        if(count==n)
        {
            System.out.println("sorry!! key element is not found");
        }

      }
      sc.close();
    }
}


