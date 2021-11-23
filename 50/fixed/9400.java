@io.swagger.annotations.ApiOperation(httpMethod = "GET", value = "Resource to get a course", response = ua.artcode.model.Course.class, produces = "application/json")
@ua.artcode.controller.RequestMapping(value = "/courses/get", method = RequestMethod.GET)
public ua.artcode.model.Course getCourseByID(@ua.artcode.controller.RequestParam
int id) throws ua.artcode.exceptions.AppException {
    ua.artcode.model.Course course = courseService.getByID(id);
    ua.artcode.controller.CourseController.LOGGER.info("Course get - OK, id {}", id);
    return course;
}