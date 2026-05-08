//WID(8/5/2026)(Sarthal Mittal)#1.1
package java8_practice.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//T(C(N))==O(1)  and S(C(N))==O(N)  as it requires contiguos space alloc in unit Time;
public class Arrayscls {//Arrays class Declare
    public static void main(String[] args){//main () method declare
        List<List<String>> skills= Arrays.asList(// Sklls's arrayList elem declare
                Arrays.asList("Python","MatPlotLib","OpenCV2","PyGame","Blender3D"),
                Arrays.asList("Java","Spring","SpringBoot"),
                Arrays.asList("JavaScript","AngularJS","ReactJs"),
                Arrays.asList("Android","FireBase","FireBaseDB"),
                Arrays.asList("SQL","MYSQL","oraclesqldev"),
                Arrays.asList("VCS",".git","SVN","SourceTree","GitHub"),
                Arrays.asList("Deployment","Oracle WebLogic 12C","itch.io"),
                Arrays.asList("GameDev","Unreal Engine","Unity","LiB(GD)X")
        );
        //Mapping multiple SkillSet's Elements into 1 combined List's Stream and Collecting its Elements in an immutablelist
        List<String> skillset=skills.stream().flatMap(skillsList->skillsList.stream()).collect(Collectors.toUnmodifiableList());
        System.out.println(skillset);//pritning SkillSet
    }
}

