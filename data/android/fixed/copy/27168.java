@java.lang.Override
public org.springframework.mock.web.MockHttpServletRequest buildRequest(javax.servlet.ServletContext servletContext) {
    org.springframework.mock.web.MockHttpServletRequest request = org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post(this.logoutUrl).buildRequest(servletContext);
    return this.postProcessor.postProcessRequest(request);
}