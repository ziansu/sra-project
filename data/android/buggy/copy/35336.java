public static java.lang.String getEnterpriseField(java.lang.String key) {
    java.lang.String name = null;
    name = org.akaza.openclinica.web.SQLInitServlet.entParams.getProperty(key).trim();
    return name == null ? "" : name;
}