@com.haalthy.service.RequestMapping(value = "/list", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
@com.haalthy.service.ResponseBody
public java.util.Set getFoobarList() {
    java.lang.String user = userMapper.getUserByUsername("user1");
    java.lang.System.out.println(user);
    return com.haalthy.service.EmployeeController.Employees;
}