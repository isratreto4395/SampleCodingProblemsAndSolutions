package mappingAClass;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMapClass class1 = new TreeMapClass();
        class1.tree();

    }

    public void tree(){
        EmployeeClass emp1 = new EmployeeClass("Jake","White",'N');
        EmployeeClass emp2 = new EmployeeClass("Samantha","Hispanic",'N');
        EmployeeClass emp3 = new EmployeeClass("Chelsea","Native American",'N');
        EmployeeClass emp4 = new EmployeeClass("Khadijah","American Indian",'N');

        TreeMap<Integer,EmployeeClass> treeMap = new TreeMap<>();
        treeMap.put(1,emp1);
        treeMap.put(2,emp2);
        treeMap.put(3,emp3);
        treeMap.put(4,emp4);

        for(Map.Entry<Integer,EmployeeClass> map3 : treeMap.entrySet()){
            int key3 = map3.getKey();
            EmployeeClass emmm = map3.getValue();
            System.out.println(key3+ " : "+emmm.empName+ " , "+emmm.empEthnicity+ " , "+emmm.empCriminalRecord);
        }









    }




















}
