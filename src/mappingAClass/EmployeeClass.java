package mappingAClass;

public class EmployeeClass {
    String empName;
    String empState;
    int empAge;
    int empSalary;
    String empPosition;
    String empEthnicity;
    char empCriminalRecord;

    EmployeeClass(String empName, String empState, int empAge, int empSalary,String empPosition ){
        this.empName = empName;
        this.empState = empState;
        this.empAge= empAge;
        this.empSalary = empSalary;
        this.empPosition= empPosition;
    }


    EmployeeClass(String empName, String empEthnicity, char empCriminalRecord){
        this.empName = empName;
        this.empEthnicity= empEthnicity;
        this.empCriminalRecord = empCriminalRecord;
    }
}
