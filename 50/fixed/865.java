@org.springframework.web.bind.annotation.RequestMapping(value = "/course/gcode/users", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<java.lang.String> getAllUsers(@org.springframework.web.bind.annotation.RequestParam(value = "gcode")
java.lang.String gcode) {
    return course.getAllUsers(domain.util.Gcode.fromString(gcode));
}