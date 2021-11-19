public Employee addEmployee(int id) {
    Employee employee = Employee(id);
    employees.put(employee.id, employee);
    return employee;
}