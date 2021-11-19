@javax.annotation.PostConstruct
private void setup() {
    servletContext = new com.hypersocket.servlet.HypersocketServletContext(getBasePath());
}