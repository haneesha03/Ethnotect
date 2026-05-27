// Pyramid pattern 
public class Pyramid {
    public static void main(String args[]){
        int n=5;
        for(int i=(n/2)+1;i>0;i--){
            for(int j=1;j<=n-i+1;j++){
                if(j>=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
