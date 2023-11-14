package OOP4Piller.Encapsulation.encapPractice.q3;

// Employee.java
// Employee Class

class salary {
  private int employee_id;
  private String employee_name;
  private double employee_salary;

  public int getEmployeeId() {
    return employee_id;
  }

  public void setEmployeeId(int employeeId) {
    this.employee_id = employeeId;
  }

  public String getEmployeeName() {
    return employee_name;
  }

  public void setEmployeeName(String employeeName) {
    this.employee_name = employeeName;
  }

  public double getEmployeeSalary() {
    return employee_salary;
  }

  public void setEmployeeSalary(double employeeSalary) {
    this.employee_salary = employeeSalary;
  }

  public String getFormattedSalary() {
    //formatted $%.2f
    return String.format("$%.2f", employee_salary);
  }
}
