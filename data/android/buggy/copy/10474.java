@com.springapp.mvc.controller.RequestMapping(value = "/getAll/{val}", method = { RequestMethod.POST })
@com.springapp.mvc.controller.ResponseBody
public java.util.List<com.springapp.mvc.model.User> getAllUserss(@com.springapp.mvc.controller.PathVariable
long val) {
    java.util.List<com.springapp.mvc.model.User> userList = userDAO.getAll(val);
    return userList;
}