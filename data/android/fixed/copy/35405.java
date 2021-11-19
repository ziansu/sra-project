@controller.RequestMapping(value = "/getRegistrations", method = RequestMethod.GET)
@controller.ResponseBody
public java.util.ArrayList<controller.Registration> getRegistration(@controller.RequestParam(value = "course_id")
int id) {
    return courseService.getRegistrations(id);
}