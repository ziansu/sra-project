public int addNewEmployee(com.inexisconsulting.dao.Employee employee) {
    if (checkEmpExists(employee)) {
        session().saveOrUpdate(employee);
        com.inexisconsulting.dao.EmployeeDAO.employeeInsertedKey = employee.getEmpId();
        return com.inexisconsulting.dao.EmployeeDAO.getEmpId();
    }else {
        return 0;
    }
}