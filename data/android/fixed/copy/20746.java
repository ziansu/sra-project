@io.swagger.annotations.ApiOperation(httpMethod = "GET", value = "Resource to get all esson", response = java.util.List.class, produces = "application/json")
@ua.artcode.controller.RequestMapping(value = "/courses/lessons/getAll", method = RequestMethod.GET)
public java.util.List<ua.artcode.model.Lesson> getAllLessons() throws ua.artcode.exceptions.AppException {
    java.util.List<ua.artcode.model.Lesson> lessons = courseService.getAllLessons();
    ua.artcode.controller.CourseController.LOGGER.info("Lesson get all - OK");
    return lessons;
}