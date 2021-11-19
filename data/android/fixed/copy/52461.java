@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
@org.springframework.web.bind.annotation.ExceptionHandler
@org.springframework.web.bind.annotation.ResponseBody
public com.tg.integration.domain.Result unknownErrorHandler(java.lang.Exception exception) {
    com.tg.integration.controller.AppDirectIntegrationController.logger.debug(("Error occurs: " + exception));
    return com.tg.integration.util.ResultBuilder.buildErrorResponse(ErrorCodes.UNKNOWN_ERROR.toString(), ("unknown error." + exception));
}