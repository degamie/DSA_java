//WID(7/5/2026)(Sarthal Mittal)#1
package java8_practice.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arrayscls {
    public static void main(String[] args){
        List<List<String>> skills= Arrays.asList(
                Arrays.asList("Java","Spring","SpringBoot"),
                Arrays.asList("JavaScript","AngularJS","ReactJs"),
                Arrays.asList("Android","FireBase","FireBaseDB"),
                Arrays.asList("SQL","MYSQL","oraclesqldev"),
                Arrays.asList("VCS",".git","SVN","SourceTree","GitHub"),
                Arrays.asList("Deployment","Oracle WebLogic 12C"),
                Arrays.asList("GameDev","Unreal Engine","Unity","LiBGDX")
        );
        List<String> skillset=skills.stream().flatMap(skillsList->skillsList.stream()).collect(Collectors.toUnmodifiableList());
        System.out.println(skillset);
    }
}
//TO Be Fixed
//        skillset.stream().filter(skillset.stream().filter(skills->skills.startsWith("J")).collect(Collectors.toList());
//        Stream<String> GDSkillStream = skillset.stream().filter(skillset.stream().filter(skills -> skills.startsWith("G")).collect(Collectors.toList()).get(skills));

//    skillsList.stream(filter(skills.allSkills.sr))


