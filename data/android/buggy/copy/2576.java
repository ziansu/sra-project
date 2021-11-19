@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
@org.springframework.web.bind.annotation.ExceptionHandler(value = org.drugis.trialverse.dataset.exception.RevisionNotFoundException.class)
@org.springframework.web.bind.annotation.ResponseBody
public org.drugis.trialverse.util.controller.AbstractTrialverseController.ErrorResponse handleRevisionNotFoundException(javax.servlet.http.HttpServletRequest request, java.lang.Exception e) {
    org.drugis.trialverse.util.controller.AbstractTrialverseController.logger.error("Error retrieving revision \n{}", request.getQueryString());
    org.drugis.trialverse.util.controller.AbstractTrialverseController.logger.error("Exception: ", e.toString());
    return new org.drugis.trialverse.util.controller.AbstractTrialverseController.ErrorResponse(500, "Internal server error");
}