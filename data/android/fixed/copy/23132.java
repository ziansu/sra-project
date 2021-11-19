@org.springframework.web.bind.annotation.RequestMapping(value = "/users/email", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<domain.util.Gcode> getEnrolledIn(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email) {
    return course.getEnrolledIn(email);
}