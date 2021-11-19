@javax.jws.WebMethod
public java.util.List<com.examples.abbasdgr8.empserv.Employee> getAllEmployees() {
    return new java.util.ArrayList<com.examples.abbasdgr8.empserv.Employee>(organization.values());
}