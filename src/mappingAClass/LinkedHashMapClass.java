package mappingAClass;

import creatingArrayListAndLinkedListFromAClass.LinkedListClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMapClass linHash = new LinkedHashMapClass();
        linHash.Linked();
    }

    public void Linked(){
        EmployeeClass employ1 = new EmployeeClass("Jake","NJ",55,85000,"QA");
        EmployeeClass employ2 = new EmployeeClass("Samantha","WI",27,76600,"DEV");
        EmployeeClass employ3 = new EmployeeClass("Chelsea","CA",64,85600,"Manager");
        EmployeeClass employ4 = new EmployeeClass("Khadijah","OH",35,67800,"Buisness Analyst");

        LinkedHashMap<Integer,EmployeeClass> link = new LinkedHashMap<>();
        link.put(1,employ1);
        link.put(2,employ2);
        link.put(3,employ3);
        link.put(4,employ4);

        for(Map.Entry<Integer,EmployeeClass> mapp : link.entrySet()){
            int key2 = mapp.getKey();
            EmployeeClass empp = mapp.getValue();
            System.out.println(key2+ " : "+ empp.empName + " , "+empp.empState+" , "+empp.empAge+" , "+empp.empSalary+" , "+empp.empPosition);
        }





    }
























}
