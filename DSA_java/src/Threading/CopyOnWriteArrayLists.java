//WID(23/6/2026)(Sarthak Mittal(Concurrency (ArrayList(Impl))
package DSA_java.src.Threading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {
    public static List<String>updateArrList(List<String> arr){
        for(String indx:arr){
            System.out.println(arr);
            if(indx=="NodeJS")arr.add("ThreeJS");
            else arr.contains("JS");}return arr;}

    public static void main(String[] args) {
        List<String> arr = new CopyOnWriteArrayList<>();
        arr.add("Js");
//        arr.add("TS");
        arr.add("NodeJS");
        arr.add("ExpressJs");
        System.out.println(arr);
        updateArrList(arr);
    }


}
