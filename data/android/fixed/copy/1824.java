@com.haalthy.service.RequestMapping(value = "/list", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
@com.haalthy.service.ResponseBody
public java.util.Set getFoobarList() {
    return com.haalthy.service.EmployeeController.Employees;
}