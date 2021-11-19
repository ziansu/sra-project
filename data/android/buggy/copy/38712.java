@org.springframework.web.bind.annotation.RequestMapping(value = "/updateEvent", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void updateEvent(@org.springframework.web.bind.annotation.RequestBody
com.luxoft.wheretogo.controller.Event event, java.security.Principal principal) {
    event = eventsService.initParticipants(event);
    event.setDeleted(com.luxoft.wheretogo.controller.RestServiceController.NOT_DELETED);
    eventsService.update(event, principal.getName());
}