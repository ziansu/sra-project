@org.springframework.web.bind.annotation.RequestMapping(value = "/system/content/deactivate/pa", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void purge(javax.servlet.http.HttpServletResponse response, @org.springframework.web.bind.annotation.RequestParam(value = "filePath", required = true)
java.lang.String filePath, @org.springframework.web.bind.annotation.RequestParam(value = "threads", required = true)
java.lang.Integer threads) throws java.io.IOException {
    paDeactivator.deactivate(new java.io.File(filePath), threads);
    response.setStatus(HttpStatusCode.OK.code());
    response.flushBuffer();
}