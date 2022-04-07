package za.ac.cput.Entity;

public class Employee {

 private String roleID;
 private String empID;
 private String empName;
 private String empEmail;
 private String empPassword;

 public Employee (EmployeeBuilder builder){
     this.roleID = builder.roleID;
     this.empID = builder.empID;
     this.empName = builder.empName;
     this.empEmail = builder.empEmail;
     this.empPassword = builder.empPassword;
 }

    public String setRoleID(String roleID) {
        this.roleID = roleID;
        return roleID;
    }

    public String setEmpID(String empID) {
        this.empID = empID;
        return empID;
    }

    public String setEmpName(String empName) {
        this.empName = empName;
        return empName;
    }

    public String setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
        return empEmail;
    }

    public String setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
        return empPassword;
    }

    @Override

    public String toString() {
        return "Employee{" +
                "roleID='" + roleID + '\'' +
                ", empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empPassword='" + empPassword + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        private String roleID;
        private String empID;
        private String empName;
        private String empEmail;
        private String empPassword;

        public EmployeeBuilder setRoleID(String roleID) {
            this.roleID = roleID;
            return this;
        }

        public EmployeeBuilder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public EmployeeBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder setEmpEmail(String empEmail) {
            this.empEmail = empEmail;
            return this;
        }

        public EmployeeBuilder setEmpPassword(String empPassword) {
            this.empPassword = empPassword;
            return this;
        }

        public Employee builder(){return new Employee(this);}


    }
}
