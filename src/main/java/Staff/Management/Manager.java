package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;


    public Manager(String deptName) {
        super("Manager", "AA 13 57 99 A", 30000);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}