public static java.lang.Integer updateEmployee(com.exercise8.core.model.Employee employee) {
    com.exercise8.core.dao.EmployeeDAO.update(employee);
    return 1;
}