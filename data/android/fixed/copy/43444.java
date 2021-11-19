@org.springframework.web.bind.annotation.ExceptionHandler(value = org.springframework.http.converter.HttpMessageNotReadableException.class)
@org.springframework.web.bind.annotation.ResponseStatus(code = org.springframework.http.HttpStatus.BAD_REQUEST, reason = com.oblenergo.chatBot.controllers.GeneralController.BADREQUESTMESSAGE)
public void errorHttpMessageNotReadable(org.springframework.http.converter.HttpMessageNotReadableException e) {
    log.error("Error in http request syntax", e);
    throw e;
}