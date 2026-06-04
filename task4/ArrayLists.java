// Arrayslist implementation includes creation and manipulation
import java.util.*;
public class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(7);
        al.add(3);
        al.add(22);
        al.add(3,6);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        for(int ele:al){
            System.out.print(ele+" ");
        }
    }
}
