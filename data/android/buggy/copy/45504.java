@io.swagger.annotations.ApiOperation(httpMethod = "GET", value = "Resource to get all courses", response = java.util.List.class, produces = "application/json")
@ua.artcode.controller.RequestMapping(value = "/courses/getAll", method = RequestMethod.GET)
public java.util.List<ua.artcode.model.Course> getAllCourses(javax.servlet.http.HttpServletRequest request) throws ua.artcode.exceptions.AppException {
    java.util.List<ua.artcode.model.Course> courses = courseService.getAllCourses();
    ua.artcode.controller.CourseController.LOGGER.info("Course get all - OK");
    return courses;
}