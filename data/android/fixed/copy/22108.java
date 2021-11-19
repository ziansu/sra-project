@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.RuntimeException.class)
@org.springframework.web.bind.annotation.ResponseStatus(code = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR, reason = com.oblenergo.chatBot.controllers.GeneralController.DEFAULTFAILUREMESSAGE)
public void error500Default(java.lang.RuntimeException e) {
    log.error("Server error occurred", e);
    throw e;
}