@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.web.client.HttpStatusCodeException.class)
@org.springframework.web.bind.annotation.ResponseStatus(code = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR, reason = com.oblenergo.chatBot.controllers.GeneralController.DEFAULTFAILUREMESSAGE)
public void errorHttpStatus(org.springframework.web.client.HttpStatusCodeException e) {
    log.error(("Error occurred with indicator service" + (e.getStatusCode().value())), e);
}