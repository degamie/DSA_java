//WID(14/8/2026)(Sarthal Mittal)#1.1.1.1.1.1
package java8_practice.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//T(C(N))==O(1)  and S(C(N))==O(N^2)  as it requires contiguos space alloc in unit Time;
public class Arrayscls {//Arrays class Declare
    List<List<String>> skills=new List<List<String>>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<List<String>> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(List<String> strings) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends List<String>> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends List<String>> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public List<String> get(int index) {
            return List.of();
        }

        @Override
        public List<String> set(int index, List<String> element) {
            return List.of();
        }

        @Override
        public void add(int index, List<String> element) {

        }

        @Override
        public List<String> remove(int index) {
            return List.of();
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<List<String>> listIterator() {
            return null;
        }

        @Override
        public ListIterator<List<String>> listIterator(int index) {
            return null;
        }

        @Override
        public List<List<String>> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    };
    void setSkills(List<List<String>> skills){
        this.skills=skills;
    }
    public static void main(String[] args){//main () method declare
        List<List<String>> skills= Arrays.asList(// Sklls's arrayList elem declare
                Arrays.asList("Java","SpringMVC","SpringBoot","Eureka Server"),
                Arrays.asList("Python","MatPlotLib","OpenCV2","PyGame","Blender3D"),
                Arrays.asList("JavaScript","AngularJS","ReactJs"),
                Arrays.asList("Android","FireBase","FireBaseDB"),
                Arrays.asList("SQL","MYSQL","oraclesqldev"),
                Arrays.asList("VCS",".git","SVN","SourceTree","GitHub"),
                Arrays.asList("Deployment","Oracle WebLogic 12C"),
                Arrays.asList("GameDev","Unreal Engine","Unity","LiB(GD)X","GDdevelop")
        );

        System.out.println(skills.get(0));
//        System.out.println(skills.get(1));
        skills.getFirst();
        System.out.println(skills);

        //Mapping multiple SkillSet's Elements into 1 combined List's Stream and Collecting its Elements in an immutablelist
        List<String> skillset=skills.stream().flatMap(skillsList->skillsList.stream()).collect(Collectors.toUnmodifiableList());
        System.out.println(skillset);//pritning SkillSet
    }
}

