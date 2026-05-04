//WID(4/5/2026)(Sarthak Mittal)(DegamiesSign)#1.1
package ArrayList;

import java.util.ArrayList;

public class Arraylists {
    public String[] args = new String[0];
    public static ArrayList<String> arr=new ArrayList<>();
    public static ArrayList<String> ArrayLists(){
        arr.add("Sarthak Mittal");
        for(int i=0;i<arr.size();i++){
            System.out.println("arraylist's indx"+i+"element"+arr.get(i));
        }
        return arr;
    }
    public static ArrayList<String> getArr() {
        return arr;
    }

    public static void Main(String[] args){
        ArrayLists();getArr();
    }
}
