package za.ac.cput.Factory;
import za.ac.cput.Entity.Employee;

public class EmployeeFactory {
    public static Employee createEmployee(String roleID, String empID, String empName, String empEmail, String empPassword ){
        return new Employee.EmployeeBuilder().setRoleID(roleID).setEmpID(empID).setEmpName(empName).setEmpEmail(empEmail).setEmpPassword(empPassword).builder();
    }


}
