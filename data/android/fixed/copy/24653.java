@org.springframework.web.bind.annotation.RequestMapping(value = "/course", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public domain.util.Gcode createCourse(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "admin")
java.lang.String admin) {
    return course.createCourse(name, admin);
}