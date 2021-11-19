@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/removeUser")
public java.lang.String removeUser(@org.springframework.web.bind.annotation.RequestParam(value = "staffID", required = true)
java.lang.String staffID) {
    try {
        biometricSystem.removeUser(staffID);
    } catch (java.lang.Exception $missing$) {
        return e.toString();
    }
    return "User removed";
}