import java.util.*;
public class addEven {
    public static void main(String[]args){
        int a[] ={3,4,5,6,7,8,12,13,15,16};
        System.out.println("Array is:"+a);
        int res = even(a);
        System.out.println("The result is:"+ res);
    }
    public static int even(int[] a){
        int sum =0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                sum += a[i];
            }
        }
        return sum;
    }
}
