public class Temperature {
    public static void main(String args[]){
        int[] temps = {32, 33, 31, 30, 45, 28, 27, 40, 30, 31, 32, 34, 42, 33, 32, 31, 30, 29, 28, 27, 29, 36, 39, 32, 33, 34, 35, 38, 33, 32};
        int lowtemp=Integer.MAX_VALUE;
        int hightemp=Integer.MIN_VALUE;
        int count=0,total=0;
        for(int i=0;i<temps.length;i++){
            lowtemp=Math.min(temps[i],lowtemp);
            hightemp=Math.max(temps[i],hightemp);
            if(temps[i]>35){
                count++;
                total+=temps[i];
            }
        }
        double avg=total/(double)count;
        System.out.println("Low temperature: "+lowtemp);
        System.out.println("Highest temperature: "+hightemp);
        System.out.println("Average temperature: "+avg);



    }
}
