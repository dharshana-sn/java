
import java.util.*;

class ReverseArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.print("\t\t\tEnter the Size of an Array:");
        int Size = sc.nextInt();
        int a[] = new int[Size];
        for (int i =0; i<a.length;i++){
            System.out.print("\t\t\tEnter the Array elements a["+i+"] : ");
            a[i]=sc.nextInt();

        }
        System.out.println("Processing......");
        Thread.sleep(3000);
        for(int i= a.length-1; i>=0;i--){
           System.out.print(a[i]+" "); 
        }

    }
}
