package mappingAClass;


import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        hash();
    }

    public static void hash(){
        EmployeeClass employee1 = new EmployeeClass("Jake","NJ",55,85000,"QA");
        EmployeeClass employee2 = new EmployeeClass("Samantha","WI",27,76600,"DEV");
        EmployeeClass employee3 = new EmployeeClass("Chelsea","CA",64,85600,"Manager");
        EmployeeClass employee4 = new EmployeeClass("Khadijah","OH",35,67800,"Buisness Analyst");
        EmployeeClass employee5 = new EmployeeClass("Aisha","White",'N');
        EmployeeClass employee6 = new EmployeeClass("Russell","Asian",'N');
        EmployeeClass employee7 = new EmployeeClass("Rimon","Asian",'N');

        HashMap<Integer,EmployeeClass> map = new HashMap<>();
        map.put(1,employee1);
        map.put(2,employee2);
        map.put(3,employee3);
        map.put(4,employee4);
        map.put(5,employee5);
        map.put(6,employee6);
        map.put(7,employee7);

        System.out.println(map.size());
        System.out.println();

        //retrieve all the keys and values

        for(Map.Entry<Integer,EmployeeClass> map1 : map.entrySet()){
            int key = map1.getKey();
            EmployeeClass em = map1.getValue();
            System.out.println(key + " : "+ em.empName+ " , "+em.empAge+ " , "+em.empState+ " , "+em.empSalary+ " , "+em.empPosition+ " , "+em.empEthnicity+ " , "+em.empCriminalRecord);
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");

            //System.out.println(key+ " : "+em.empName+ " , "+em.empEthnicity+ " , "+em.empCriminalRecord);
        }

    }
























}
