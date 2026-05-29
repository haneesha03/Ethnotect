import java.util.*;
public class ProductExceptSelf {
    public static void main(String args[]){
        int[] a={1,3,4,2};
        int[] prefix=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(i==0){
                prefix[i]=1;
            }
            else{
                prefix[i]=prefix[i-1]*a[i-1];
            }
        }
        // int[] suffix=new int[a.length];
        // for(int i=a.length-1;i>=0;i--){
        //     if(i==a.length-1){
        //         suffix[i]=1;
        //     }
        //     else{
        //         suffix[i]=suffix[i+1]*a[i+1];
        //     }
        // }
        // for(int i=0;i<a.length;i++){
        //     a[i]=prefix[i]*suffix[i];
        // }
        int suffix=1;
        for(int i=a.length-1;i>=0;i--){
            prefix[i]*=suffix;
            suffix*=a[i];
        }
        System.out.println(Arrays.toString(prefix));
    }

}
