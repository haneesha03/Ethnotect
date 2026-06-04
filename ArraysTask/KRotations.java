//Rotate array by four times 
import java.util.*;
public class KRotations{
    public static void reverse(int i,int j,int[] a){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        int k=2;
        reverse(0,k,a);
        reverse(k+1,a.length-1,a);
        reverse(0,a.length-1,a);
        System.out.println(Arrays.toString(a));
    }
}