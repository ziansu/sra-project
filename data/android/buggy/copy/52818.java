@org.springframework.web.bind.annotation.GetMapping(value = "/heartbeat")
public com.hiddenite.model.Status getStatus(com.hiddenite.controller.HttpServletRequest request) throws java.lang.Exception {
    return endPointService.handleEndPointRequest();
}