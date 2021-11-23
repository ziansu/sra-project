@com.app.mvc.controller.RequestMapping(value = "/events", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.app.mvc.controller.response.Response> retrieveAll() {
    java.util.ArrayList<com.app.mvc.controller.response.ResponseData> data = eventService.getAll();
    return com.app.mvc.controller.response.ResponseFactory.ok(data);
}