public class JaggedArrays {
    public static void main(String args[]){
        int[][] studmarks=new int[5][];
        studmarks[0]=new int[2];
        studmarks[1]=new int[3];
        studmarks[2]=new int[4];
        studmarks[3]=new int[5];
        studmarks[4]=new int[3];
        for(int i=0;i<studmarks.length;i++){
            for(int j=0;j<studmarks[i].length;j++){
                studmarks[i][j]=i*j*100;
            }

        }
        for(int i=0;i<studmarks.length;i++){
            for(int j=0;j<studmarks[i].length;j++){
                System.out.print(studmarks[i][j]+" ");
            }
            System.out.println();

        }

    }
}
