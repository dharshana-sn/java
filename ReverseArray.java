import java.util.*;
class ArrayRe{
    public static void reverse(int[]a){
        int l=0,r=a.length-1;
        while(l<r){
            int temp = a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
          
        }}
        public static void main(String[]args){
int a[] ={2,4,5,6,7,9};
System.out.println("Initial:"+Arrays.toString(a));
reverse(a);
System.out.println("After:"+Arrays.toString(a));
        }

    }

    
