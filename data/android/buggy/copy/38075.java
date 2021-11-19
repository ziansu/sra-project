@controller.RequestMapping(value = "/getNumberOfEvents", method = RequestMethod.GET)
@controller.ResponseBody
public int getNumberOfEvents(@controller.RequestParam(value = "registration_id")
java.util.ArrayList<java.lang.Integer> registration_id, @controller.RequestParam(value = "event_id")
int event_id) {
    int i = courseService.getNumberOfEvents(registration_id, event_id);
    java.lang.System.out.println(("Controller (getnumberofevents): ************************* " + i));
    return i;
}