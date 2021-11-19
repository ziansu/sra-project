@java.lang.Override
public int manageUserAccess(com.psk.pms.model.Employee employee) {
    int status = employeeDAO.manageUserAccess(employee);
    return status;
}