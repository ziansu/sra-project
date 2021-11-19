public void init() throws javax.servlet.ServletException {
    servlet.FileLeaveServlet.DF.setTimeZone(java.util.TimeZone.getTimeZone("GMT+8"));
    servlet.FileLeaveServlet.MAPPER.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
}