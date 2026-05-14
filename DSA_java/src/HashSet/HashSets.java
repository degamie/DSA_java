//WID(14/5/2026)(Sarthak Mittal)#1HashSets.1
//Common Elements(T(C(N))==O(n) and S(C(N))==O(n^2 ) as it requires both dynamic and contigous space iteratively
package HashSet;
import   java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class HashSets {

    public static Set<Integer>getIntersection(int[] arr1,int[] arr2){
        Set<Integer> hashset=new HashSet<>();
        for(int num:arr1){
           hashset.add(num);
        }
        for(int num:arr2){
            Set<Integer> commonhashSet=new HashSet<>();
            if(hashset.contains(num)){
                commonhashSet.add(num);
            }
        }return hashset;
    }
        public static  void Main(String[] args){
            int[] arr1 = new int[0];int[] arr2=new int[0];
            getIntersection(arr1,arr2);
        }

}
public class ConcurrentHashSet {
    public static String userId=null;
    public static  void main(String[] args){
        final Set<Integer>activeUsers=new ConcurrentSkipListSet<>();
        void trackUsers(userId){
            activeUsers.add(userId);
        }
    }

}



//    public static void Main(String[] args){
//        HashSet<Integer> hashSet=new HashSet<>();
//        hashSet.put(1);
//        hashSet.put(2);
//        hashSet.put(3);
//        System.out.println(hashSet);
//    }

