@controller.RequestMapping(value = "/getNumberOfEvents", method = RequestMethod.GET)
@controller.ResponseBody
public java.lang.Integer getNumberOfEvents(@controller.RequestParam(value = "event_id")
int event_id) {
    return courseService.getNumberOfEvents(event_id);
}