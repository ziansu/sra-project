@controller.RequestMapping(method = RequestMethod.GET, produces = "application/json")
@controller.ResponseBody
public java.lang.String loadAllEvents(@controller.RequestParam
java.util.Map<java.lang.String, java.lang.String> params) throws com.fasterxml.jackson.core.JsonProcessingException {
    return mapper.writeValueAsString(eventService.loadAllEvents());
}