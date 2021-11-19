@com.theironyard.controllers.RequestMapping(path = "/logout", method = RequestMethod.POST)
public void childLogout(@com.theironyard.controllers.RequestHeader(value = "Authorization")
java.lang.String childToken, javax.servlet.http.HttpSession session) {
    com.theironyard.controllers.Child child = authService.getChildFromAuth(childToken);
    session.invalidate();
}