@com.app.mvc.controller.RequestMapping(value = "/events", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.app.mvc.controller.response.Response> retrieveAll(@com.app.mvc.controller.RequestParam(value = com.app.mvc.controller.EventsController.PARAM_ID)
java.lang.String systemId) {
    com.app.mvc.controller.EventsController.logger.info(("Retrieve all events. Accepted request with systemId = " + systemId));
    java.util.ArrayList<com.app.mvc.controller.response.ResponseData> data = eventService.getAll();
    return com.app.mvc.controller.response.ResponseFactory.ok(data);
}