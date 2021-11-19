@com.biblioteka.service.RequestMapping(value = "/list", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
@com.biblioteka.service.ResponseBody
public java.util.List<com.biblioteka.model.Employee> employeeList() {
    com.biblioteka.model.dao.EmployeeDAO employeeDAO = new com.biblioteka.model.dao.EmployeeDAO();
    return employeeDAO.getAllEmployees();
}