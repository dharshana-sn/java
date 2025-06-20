import java.util.*;
class CopyArray{
    public static void main(String[]args){
       int a[] = {3,4,5,6,7,8};
       System.out.println("a:" +Arrays.toString(a));
       int []res = copy(a);
        System.out.println("res:" +Arrays.toString(a));
    }
    public static int[] copy(int[] a){
int x[] = new int[a.length];
for(int i=0;i<a.length;i++){
    x[i]=a[i];
}
return x;
    }
}